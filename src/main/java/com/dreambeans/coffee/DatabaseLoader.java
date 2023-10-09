package com.dreambeans.coffee;

import com.dreambeans.coffee.models.Cart;
import com.dreambeans.coffee.models.Customer;
import com.dreambeans.coffee.models.Menu;
import com.dreambeans.coffee.models.Product;
import com.dreambeans.coffee.service.CartService;
import com.dreambeans.coffee.service.CustomerService;
import com.dreambeans.coffee.service.MenuService;
import com.dreambeans.coffee.service.ProductService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class DatabaseLoader implements CommandLineRunner {
    private CustomerService customerService;
    private CartService cartService;
    private MenuService menuService;
    private ProductService productService;
    
    
    public DatabaseLoader(CustomerService customerService, CartService cartService, MenuService menuService, ProductService productService) {
        this.customerService = customerService;
        this.cartService = cartService;
        this.menuService = menuService;
        this.productService = productService;
    }


    @Override
    public void run(String... args) throws Exception {
        Customer cust1 = new Customer("customer1","password");
        customerService.saveCustomer(cust1);

        Customer cust2 = new Customer("customer2","password");
        customerService.saveCustomer(cust2);

        Customer cust3 = new Customer("customer3","password");
        customerService.saveCustomer(cust3);

        //Customer 1 carts
        Cart cart1 = new Cart(cust1);
        cartService.saveCart(cart1);

        Cart cart2 = new Cart(cust2);
        cartService.saveCart(cart2);


        Menu menu1 = new Menu("Hot Coffee", "This is all the Hot Coffee", "../img/latte.jpg");
        menuService.saveMenu(menu1);

        Menu menu2 = new Menu("Iced Coffee", "This is all Iced Coffee", "../img/iced_mocha.jpeg");
        menuService.saveMenu(menu2);

        Menu menu3 = new Menu("Hot Tea", "This is all Hot Tea", "../img/chamomiletea.jpeg");
        menuService.saveMenu(menu3);

        Menu menu4 = new Menu("Pastries", "This is all Pastries", "../img/scone.jpeg");
        menuService.saveMenu(menu4);


        Product Americano = new Product (4.50,"Espresso diluted with hot water.", "Americano", "../img/Americano1.jpeg",4,menu1);
        productService.saveProduct(Americano);

        Product Espresso = new Product(4,"A shot of pure, intense coffee.", "Espresso", "../img/espresso1.avif", 4, menu1);
        productService.saveProduct(Espresso);

        Product Cappuccino = new Product(5,"Espresso, steamed milk, and foam.", "Cappuccino", "../img/cappuccino1.avif", 4, menu1);
        productService.saveProduct(Cappuccino);

        Product Latte = new Product(6,"Espresso with steamed milk and a small amount of foam.", "Latte", "../img/latte.jpg", 4, menu1);
        productService.saveProduct(Latte);

        Product Mocha = new Product(6,"Espresso with steamed milk, chocolate, and whipped cream.", "Mocha", "../img/mocha.avif", 4, menu1);
        productService.saveProduct(Mocha);

        Product Machiato = new Product(5,"Espresso \"stained\" with a dollop of frothy milk.", "Machiato", "../img/machiato.avif", 4, menu1);
        productService.saveProduct(Machiato);

        Product Cold_Brew = new Product(5,"Smooth and strong coffee brewed cold, served over ice.", "Cold Brew", "../img/cold_brew.avif", 4, menu2);
        productService.saveProduct(Cold_Brew);

        Product Iced_Mocha = new Product(5,"Espresso with steamed milk, chocolate, and whipped cream in ice", "Iced Mocha", "../img/iced_mocha.jpeg", 4, menu2);
        productService.saveProduct(Iced_Mocha);

        Product Iced_Coffee = new Product(4,"Chilled coffee served over ice.", "Iced Coffee", "../img/icedcoffee.avif", 4, menu2);
        productService.saveProduct(Iced_Coffee);

        Product Iced_Latte = new Product(6,"Espresso, cold milk, and ice.", "Iced Latte", "../img/icedlatte.avif", 4, menu2);
        productService.saveProduct(Iced_Latte);

        Product Iced_Americano = new Product(4.50,"Espresso with cold water over ice.", "Iced Americano", "../img/icedamericano.avif", 4, menu2);
        productService.saveProduct(Iced_Americano);

        Product Black_Tea = new Product(3.50,"Hot Tea.", "Black Tea", "../img/black_tea.jpeg", 4, menu3);
        productService.saveProduct(Black_Tea);

        Product Green_Tea = new Product(3.50,"Hot Tea.", "Green Tea", "../img/greentea.jpeg", 4, menu3);
        productService.saveProduct(Green_Tea);

        Product Chai_Tea = new Product(3.50,"Hot Tea.", "Chai Tea", "../img/chaitea.jpeg", 4, menu3);
        productService.saveProduct(Chai_Tea);

        Product Chamomile_Tea = new Product(3.50,"Hot Tea.", "Chamomile Tea", "../img/chamomiletea.jpeg", 4, menu3);
        productService.saveProduct(Chamomile_Tea);

        Product Muffin = new Product(3,"Pastries.", "Muffin", "../img/muffins.avif", 4, menu4);
        productService.saveProduct(Muffin);

        Product Scone = new Product(3,"Pastries", "Scone", "../img/scone.jpeg", 4, menu4);
        productService.saveProduct(Scone);

        Product Cookie = new Product(1.50,"Pastries", "Cookie", "../img/cookie.avif", 4, menu4);
        productService.saveProduct(Cookie);

    }
}
