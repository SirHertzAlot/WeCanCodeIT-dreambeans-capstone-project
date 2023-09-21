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


document.querySelectorAll('.addCart').forEach(button =>{
    button.addEventListener('click', ()=>{
        addToCart();
    })
})
function addToCart(){
    let cartQtyElement = document.querySelector(".cartQuantity");
    let cartQty = parseInt(cartQtyElement.textContent);
    cartQty++;
    cartQtyElement.textContent = cartQty;
}
