//example db
const sample_db = [
  {
    id: 1,
    name: "Item 1",
    price: 10.35,
    qty: 0,
    image: "../img/dream bean.png",
  },
  {
    id: 2,
    name: "Item 2",
    price: 10.99,
    qty: 2,
    image: "../img/dream bean.png",
  },
  {
    id: 3,
    name: "Item 3",
    price: 20.35,
    qty: 3,
    image: "../img/dream bean.png",
  },
  {
    id: 3,
    name: "Item 3",
    price: 20.35,
    qty: 1,
    image: "../img/dream bean.png",
  },
  {
    id: 3,
    name: "Item 3",
    price: 20.35,
    qty: 0,
    image: "../img/dream bean.png",
  },
];


//nav hamburger menu
document.addEventListener("DOMContentLoaded", function () {
  console.log(sample_db);
  const hamburger = document.querySelector(".hamburger");
  const navMenu = document.querySelector(".nav-menu");

  hamburger.addEventListener("click", () => {
    hamburger.classList.toggle("active");
    navMenu.classList.toggle("active");
  });
  document.querySelectorAll(".link").forEach((n) =>
    n.addEventListener("click", () => {
      hamburger.classList.remove("active");
      navMenu.classList.remove("active");
    })
  );
  
  const itemList = document.getElementsByClassName("item-list")[0];

  // this is calling the api for a menu
  let products;
  fetch("http://localhost:8080/api/products/allproducts/1") 
    .then(response => response.json())
    .then(products => displayMenu(products)) 
    .catch(error => console.log(error));
    
    

  //menu html

  function createItemElement(item) {
    const menuItem = document.createElement("div");
    menuItem.classList.add("menu-item");
    const menuContent = document.createElement("div");
    menuContent.classList.add("menu-content");
    const itemImg = document.createElement("img");
    itemImg.classList.add("latte");
    itemImg.src = item.image;
    menuContent.appendChild(itemImg);
    const itemContent = document.createElement("div");
    itemContent.classList.add("item-content");
    const itemBg = document.createElement("div");
    itemBg.classList.add("item-background");
    const addToBasket = document.createElement("div");
    addToBasket.classList.add("add-to-cart");
    const addButton = document.createElement("button");
    addButton.classList.add("add-button");
    addButton.innerHTML = ` Add to Basket `;
    addToBasket.appendChild(addButton);
    itemBg.appendChild(addToBasket);
    const itemDesc = document.createElement("div");
    itemDesc.classList.add("item-desc");
    const itemName = document.createElement("div");
    itemName.classList.add("item-name");
    itemName.innerHTML = `<h4>${item.name}</h4>`;
    itemDesc.appendChild(itemName);
    const itemPrice = document.createElement("div");
    itemPrice.classList.add("item-price");
    itemPrice.innerHTML = `$${item.price}`;
    itemDesc.appendChild(itemPrice);
    const itemQty = document.createElement("div");
    itemQty.classList.add("item-qty");
    itemQty.innerHTML = `<button class="decrement">-</button><span class ="quantity" data-itemId=${item.id}> 1 </span><button class="increment">+</button>`;
    itemContent.appendChild(itemBg);
    itemContent.appendChild(itemDesc);
    itemDesc.appendChild(itemQty);
    menuItem.appendChild(menuContent);
    menuItem.appendChild(itemContent);
    return menuItem;
  }


  //display menu
  function displayMenu(products) {
    console.log("inside the menu",products);
    products.forEach(function (item) {
      const qty = item.quantity;
      if (qty > 0) {
        const itemElement = createItemElement(item);
        itemList.appendChild(itemElement);
      }
    });
  }

  const cart = [];
  const cartList = document.querySelector(".cart");
  const cartSide = document.querySelector(".cart-side");
  const closeCartBttn = document.querySelector(".close-bttn");
  const cartBttn = document.querySelector(".cart-bttn");

  // button for cart
  cartBttn.addEventListener("click", function () {
    cartSide.classList.add("open");
  });

  closeCartBttn.addEventListener("click", function () {
    cartSide.classList.remove("open");
  });

  displayMenu(products);

  //add item to cart when clicked
  document.querySelectorAll(".add-button").forEach(function (button) {
    button.addEventListener("click", function () {
      const itemContainer = button.closest(".menu-item");
      const itemQtyAdd = parseInt(
        itemContainer.querySelector(".quantity").textContent
      );
      let cartQtyElement = document.querySelector(".cartQuantity");
      let cartQty = parseInt(cartQtyElement.textContent);
      cartQty += itemQtyAdd;

      cartQtyElement.textContent = cartQty;
      const item = {
        name: itemContainer.querySelector(".item-name h4").textContent,
        price: parseFloat(
          itemContainer
            .querySelector(".item-price")
            .textContent.replace("$", "")
        ),
        qty: itemQtyAdd,
      };
      addToCart(item);
    });
  });

  //function to add item into the cart
  function addToCart(item) {
    cart.push(item);
    updateCart();
  }

  //update cart function

  function updateCart() {
    cartList.innerHTML = "";
    let total = 0;
    const cartTotal = document.querySelector(".cart-total");
    const groupedItems = {};

    cart.forEach(function (item) {
      const itemName = item.name;
      const itemPrice = item.price;
      const itemId = item.id;
      if (groupedItems[itemName]) {
        groupedItems[itemName].qty += item.qty;
        groupedItems[itemName].totalPrice += item.qty * itemPrice;
      } else {
        groupedItems[itemName] = {
          itemPrice: itemPrice,
          qty: item.qty,
          totalPrice: item.qty * itemPrice,
        };
      }
    });
    for (const itemName in groupedItems) {
      const itemInfo = groupedItems[itemName];
      const cartItem = document.createElement("li");
      cartItem.innerHTML = `<div>${itemName} - $${itemInfo.itemPrice} - ${itemInfo.qty} - $${itemInfo.totalPrice.toFixed(2)}
      <button onclick="deleteItem(${itemInfo.itemId})"><i class="fa-solid fa-trash"></i></button></div>`;
      cartList.appendChild(cartItem);
      total += itemInfo.totalPrice;
    }
    cartTotal.textContent = `Total: $${total.toFixed(2)}`;
  }
  //increment button for every item
  document.querySelectorAll(".increment").forEach(function (button) {
    button.addEventListener("click", function () {
      const itemQty = button.parentElement.querySelector(".quantity");
      const itemId = itemQty.getAttribute("data-itemId");
      let currentQuantity = parseInt(itemQty.textContent);
      currentQuantity++;
      itemQty.textContent = currentQuantity;
    });
  });

  //decrement button for every item
  document.querySelectorAll(".decrement").forEach(function (button) {
    button.addEventListener("click", function () {
      const itemQty = button.parentElement.querySelector(".quantity");
      const itemId = itemQty.getAttribute("data-itemId");
      let currentQuantity = parseInt(itemQty.textContent);
      if (currentQuantity > 0) {
        currentQuantity--;
        itemQty.textContent = currentQuantity;
      }
    });
  });

});
