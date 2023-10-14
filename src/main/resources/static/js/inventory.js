
// this is calling the api for the inventory
let products;
fetch("http://localhost:8080/api/products/allproducts")
  .then((response) => response.json())
  .then((products) => displayInventory(products))
  .catch((error) => console.log(error));

const inventoryID = document.getElementsByClassName("inventory-id")[0];
const inventoryName = document.getElementsByClassName("inventory-name")[0];
const inventoryPrice = document.getElementsByClassName("inventory-price")[0];
const inventoryQTY = document.getElementsByClassName("inventory-qty")[0];
const inventoryAction = document.getElementsByClassName("inventory-action")[0];
function displayInventory(products) {
  console.log(products);
  products.forEach((item) => {
    const listItemId = document.createElement("li");
    listItemId.classList.add("inventory-item-id");
    const listItemName = document.createElement("li");
    listItemName.classList.add("inventory-item-name");
    const listItemPrice = document.createElement("li");
    listItemPrice.classList.add("inventory-item-price");
    const listItemQty = document.createElement("li");
    listItemQty.classList.add("inventory-item-qty");
    const listItemAction = document.createElement("li");
    listItemAction.classList.add("inventory-item-action");
    listItemId.innerHTML = `<span>${item.id}</span>`;
    listItemName.innerHTML = `<span>${item.name}</span>`;
    listItemPrice.innerHTML = `<span>${item.price}</span>`;
    listItemQty.innerHTML = `<span>${item.quantity}</span>`;
    listItemAction.innerHTML = `
    <button onclick="editItem(${item.id})"><i class="fa-solid fa-pen-to-square"></i></button>
    <button onclick="deleteItem(${item.id})"><i class="fa-solid fa-trash"></i></button>`;
    inventoryID.appendChild(listItemId);
    inventoryName.appendChild(listItemName);
    inventoryPrice.appendChild(listItemPrice);
    inventoryQTY.appendChild(listItemQty);
    inventoryAction.appendChild(listItemAction);
  });

  const newItem = document.createElement("Item");
  newItem.innerHTML = `
        <input class="title-input" placeholder="Title" type="text">
        <input class="summary-input" placeholder="Summary" type="textbox">
        <button class="submit-new-item">Submit New Item</button>
    `;
  newItem
    .querySelector(".submit-new-item")
    .addEventListener("click", (clickEvent) => {
      clickEvent.preventDefault();
      console.log("clicked to add item");
      // clearChildren(mainContent);
      const itemJson = {
        id: '0',
        price: newItem.querySelector("itemPrice").value,
        description: newItem.querySelector("itemDesc").value,
        name: newItem.querySelector("itemName").value,
        image: newItem.querySelector(".itemImage").value,
        quantity: newItem.querySelector("itemQuantity").value,
        menuId: newItem.querySelector("itemMenuId").value,

      };
      console.log(itemJson);
      fetch("http://localhost:8080/api/products/save", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify(itemJson),
      })
        .then((response) => response.json())
        .then((products) => displayInventory(products))
        .catch((error) => console.log(error));
    });
}
