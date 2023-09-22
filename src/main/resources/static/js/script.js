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


document.querySelectorAll('.add-button').forEach(button =>{
    button.addEventListener('click', ()=>{
        addToCart();
    })
})

function addToCart(){
    let cartQtyElement = document.getElementsByClassName(".cartQuantity");
    let cartQty = parseInt(cartQtyElement.textContent);
    cartQty++;
    cartQtyElement.textContent = cartQty;
}

const sample_db = [
  {id: 1, name: "Item 1", price: 10.35, image: "../img/dream bean.png"},
  {id: 2, name: "Item 2", price: 10.99, image: "../img/dream bean.png"},
  {id: 3, name: "Item 3", price: 20.35, image: "../img/dream bean.png"}
]

document.addEventListener("DOMContentLoaded", function(){
const itemList = document.getElementById("item-list");

function createItemElement(item){
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
  addToBasket.innerHTML = `<button class="add-button"> Add to Cart </button>`;
  itemBg.appendChild(addToBasket);

  const itemDesc = document.createElement("div");
  itemDesc.classList.add("item-desc");
  const itemName = document.createElement("div");
  itemName.classList.add("item-name");
  itemName.innerHTML = `<h3>${item.name}</h3>`;
  itemDesc.appendChild(itemName);
  const itemPrice = document.createElement("div");
  itemPrice.classList.add("item-price");
  itemPrice.innerHTML = `$${item.price}`;
  itemDesc.appendChild(itemPrice);
  // const itemQty= document.createElement("span");
  // itemQty.classList.add("item-qty");
  // itemQty.innerHTML = '${0}'

  itemContent.appendChild(itemBg);
  itemContent.appendChild(itemDesc);
  menuItem.appendChild(menuContent);
  menuItem.appendChild(itemContent);
  return menuItem;
}

function displayMenu(){
  sample_db.forEach(function(item){
    const itemElement = createItemElement(item);
    itemList.appendChild(itemElement);
  });
}
displayMenu();
});