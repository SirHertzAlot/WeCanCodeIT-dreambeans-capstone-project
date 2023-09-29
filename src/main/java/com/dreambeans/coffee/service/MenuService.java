package com.dreambeans.coffee.service;


import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dreambeans.coffee.models.Menu;
import com.dreambeans.coffee.models.Product;
import com.dreambeans.coffee.repositories.MenuRepository;


@Service
public class MenuService{
    private MenuRepository menuRepo; 
    
    public void loadProducts() {

        Product product1 = new Product(1.99, "coffee1", "name1", "image1");
        Product product2 = new Product(2.99, "coffee2", "name1", "image2");
        Product product3 = new Product(3.99, "coffee3", "name1", "image3");

        menuRepo.addProduct(product1);
        menuRepo.addProduct(product2);
        menuRepo.addProduct(product3);
    }


	
    public Optional<Menu> findProductById(Long id) {
        return menuRepo.findById(id);
    }
}
