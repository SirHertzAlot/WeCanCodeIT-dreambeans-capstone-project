  const inventoryID = document.getElementsByClassName("inventory-id")[0];
  const inventoryName = document.getElementsByClassName("inventory-name")[0];
  const inventoryPrice = document.getElementsByClassName("inventory-price")[0];
  const inventoryQTY = document.getElementsByClassName("inventory-qty")[0];
  const inventoryAction = document.getElementsByClassName("inventory-action")[0];
    function displayInventory(){
  inventoryData.forEach((item) => {
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
    listItemQty.innerHTML = `<span>${item.qty}</span>`;
    listItemAction.innerHTML = `
    <button onclick="editItem(${item.id})"><i class="fa-solid fa-pen-to-square"></i></button>
    <button onclick="deleteItem(${item.id})"><i class="fa-solid fa-trash"></i></button>`;
    inventoryID.appendChild(listItemId);
    inventoryName.appendChild(listItemName);
    inventoryPrice.appendChild(listItemPrice);
    inventoryQTY.appendChild(listItemQty);
    inventoryAction.appendChild(listItemAction);
  });
    }
displayInventory();