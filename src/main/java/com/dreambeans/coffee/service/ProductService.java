package com.dreambeans.coffee.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dreambeans.coffee.models.Product;
import com.dreambeans.coffee.repositories.ProductRepository;

@Service
public class ProductService {
    private ProductRepository productRepo;

    public Iterable<Product> listAllProducts() {
        return productRepo.findAll();
    }

    public Optional<Product> findProductsById(Long id) {
        return productRepo.findById(id);
    }

    public void saveProduct(Product savedProduct) {
        productRepo.save(savedProduct);
    }


}