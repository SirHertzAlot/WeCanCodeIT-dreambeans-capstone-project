package com.dream_beans.coffee.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dream_beans.coffee.models.Product;

@Service
public class ProductService {
    private ProductRepository productRepo;

    public Iterable<Product> listAllProducts() {
        return productRepo.findAll();
    }

    public Optional<Product> findProductsById(Long id) {
        return productRepo.findById(id);
    }
}