package com.dream_beans.coffee;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import com.dream_beans.coffee.Repositories.OrdersRepository;
import com.dream_beans.coffee.models.Orders;


// @Component
// public class DatabaseLoader implements CommandLineRunner {

//     private final OrdersRepository repository;

//     String[] itemsOrdered = new String[]{"Coffee", "Cream", "Sugar"};
//     @Autowired
//     public DatabaseLoader(OrdersRepository repository) {
//         this.repository = repository;
//     }

    // @Override
    // public void run(String... strings) throws Exception {
    //     Orders order1 = new Orders(1,1,"Lenette Gofton", "itemsOrdered", 2, 12.99f,"8:03","4/28/2023");
    //     repository.save(order1);
    // }


