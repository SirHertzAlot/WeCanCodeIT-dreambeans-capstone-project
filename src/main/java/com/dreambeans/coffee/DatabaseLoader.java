package com.dreambeans.coffee;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dreambeans.coffee.models.Orders;
import com.dreambeans.coffee.models.Product;
import com.dreambeans.coffee.repositories.OrdersRepository;
import com.dreambeans.coffee.repositories.ProductRepository;
import com.dreambeans.coffee.service.ProductService;

import jakarta.annotation.Resource;


@Component
public class DatabaseLoader implements CommandLineRunner {
    private ProductService productService;
    @Resource
    private ProductRepository productRepo;
    public DatabaseLoader(ProductService productService, ProductRepository productRepo) {
        this.productService = productService;
        this.productRepo = productRepo;
    }

    @Override
    public void run(String... args)throws Exception {
        Product latte = new Product(3.99, "latte", "hot coffee", "https://www.allrecipes.com/thmb/Dq9kocJWJNmhfPotGiZT6Tl_r1w=/750x0/filters:no_upscale([…]):format(webp)/9428203-9d140a4ed1424824a7ddd358e6161473.jpg");
        // productService.saveProduct(latte);
        productRepo.save(latte);

        // Product americano = new Product(price:4.50, descrition:Espresso diluted with hot water, image:src/main/resources/assets/coffee_shop_images/Americano.png);

    }
    }


