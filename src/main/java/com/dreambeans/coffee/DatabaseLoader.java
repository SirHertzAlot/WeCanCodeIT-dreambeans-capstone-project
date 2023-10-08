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


        Menu menu1 = new Menu("Lattes", "This is all the Lattes", "src\\main\\resources\\assets\\coffee_shop_images\\latte1.avif");
        menuService.saveMenu(menu1);

        Menu menu2 = new Menu("Mochas", "This is all the Mochas", "src\\main\\resources\\assets\\coffee_shop_images\\latte1.avif");
        menuService.saveMenu(menu2);

        Product product1 = new Product(5.99,"This is a caramel latte", "Caramel Latte", "../img/latte1.avif",4, menu1);
        productService.saveProduct(product1);

        Product product2 = new Product(5.99,"This is a mocha latte", "Mocha Latte", "../img/mocha.avif", 4, menu2);
        productService.saveProduct(product2);

    }
}
