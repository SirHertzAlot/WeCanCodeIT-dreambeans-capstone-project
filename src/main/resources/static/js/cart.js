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

//add item to cart when clicked
document.querySelectorAll(".add-button").forEach(function (button) {
  button.addEventListener("click", function () {
    console.log("Button clicked");
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
        itemContainer.querySelector(".item-price").textContent.replace("$", "")
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
    cartItem.innerHTML = `<div>${itemName} - $${itemInfo.itemPrice} - ${
      itemInfo.qty
    } - $${itemInfo.totalPrice.toFixed(2)}
    <button onclick="deleteItem(${
      itemInfo.itemId
    })"><i class="fa-solid fa-trash"></i></button></div>`;
    cartList.appendChild(cartItem);
    total += itemInfo.totalPrice;
  }
  cartTotal.textContent = `Total: $${total.toFixed(2)}`;
}
