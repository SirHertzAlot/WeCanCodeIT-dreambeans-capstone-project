const displayProduct = function (product) {

    const productArea = document.querySelector(".first-product");
    const productImage = document.createElement("img");
    productImage.setAttribute("src", product.image);
    productImage.setAttribute("width", "100");
    const productName = document.createElement("h1");
    productName.innerText = product.name;
}