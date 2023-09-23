package com.dream_beans.coffee;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dream_beans.coffee.Repositories.OrdersRepository;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final OrdersRepository repository;

    String[] itemsOrdered = new String[]{"Coffee", "Cream", "Sugar"};
    @Autowired
    public DatabaseLoader(OrdersRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Order(1,1,"Lenette Gofton", itemsOrdered, 2, 12.99f,"8:03","4/28/2023"));
    }
}
