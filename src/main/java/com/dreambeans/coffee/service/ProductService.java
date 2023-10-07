package com.dreambeans.coffee.service;

import com.dreambeans.coffee.models.Product;
import com.dreambeans.coffee.repositories.ProductsRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    private ProductsRepository productRepo;

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
