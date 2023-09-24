package com.dreambeans.coffee;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dreambeans.coffee.models.Orders;
import com.dreambeans.coffee.models.Product;
import com.dreambeans.coffee.repositories.OrdersRepository;
import com.dreambeans.coffee.repositories.ProductRepository;
import com.dreambeans.coffee.service.ProductService;


@Component
public class DatabaseLoader implements CommandLineRunner {
    private ProductService productService;
    private ProductRepository productRepo;
    public DatabaseLoader(ProductService productService, ProductRepository productRepo) {
        this.productService = productService;
    }

    @Override
    public void run(String... args)throws Exception {
        Product latte = new Product(3.99, "latte", "hot coffee", "https://www.allrecipes.com/thmb/Dq9kocJWJNmhfPotGiZT6Tl_r1w=/750x0/filters:no_upscale([…]):format(webp)/9428203-9d140a4ed1424824a7ddd358e6161473.jpg");
        // productService.saveProduct(latte);
        productRepo.save(latte);
    }
    }


