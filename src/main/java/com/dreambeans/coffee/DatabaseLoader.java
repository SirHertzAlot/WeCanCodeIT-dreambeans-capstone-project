package com.dreambeans.coffee;

import com.dreambeans.coffee.models.Cart;
import com.dreambeans.coffee.models.Customer;
import com.dreambeans.coffee.service.CartService;
import com.dreambeans.coffee.service.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class DatabaseLoader implements CommandLineRunner {
    private CustomerService customerService;
    private CartService cartService;

    public DatabaseLoader(CustomerService customerService, CartService cartService){
        this.customerService = customerService;
        this.cartService = cartService;
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
        Cart cart1 = new Cart("4", 4, 22.99f, "10:37am", "11/1/2020", "10:10am", cust1);
        cartService.saveCart(cart1);
    }
}
