
package com.dreambeans.coffee.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dreambeans.coffee.models.Product;
import com.dreambeans.coffee.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductsController {
    
    private ProductService productService;

     

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/allproducts")
    public Iterable<Product> getAllProducts() {
        return productService.listAllProducts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Optional<Product> product = productService.findProductsById(id);
        if (product.isPresent()) {
            return ResponseEntity.ok(product.get());
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/product")
    public Product getOneProduct() { 
        Product latte = new Product(3.99, "latte", "hot coffee", "https://www.allrecipes.com/thmb/Dq9kocJWJNmhfPotGiZT6Tl_r1w=/750x0/filters:no_upscale([…]):format(webp)/9428203-9d140a4ed1424824a7ddd358e6161473.jpg");
        return latte;
    }





    // @PostMapping("/create")
    // public ResponseEntity<Product> createProduct(@RequestBody Product product) {
    // Product savedProduct = productService.save(product);
    // return ResponseEntity.status(HttpStatus.CREATED).body(savedProduct);
    // }

    // @PutMapping("/{id}")
    // public ResponseEntity<Product> updateProduct(@PathVariable Long id,
    // @RequestBody Product updatedProduct) {
    // Optional<Product> existingProduct = productService.findById(id);
    // if(existingProduct.isPresent()) {
    // Product product = existingProduct.get();
    // product.setName(updatedProduct.getName());
    // product.setDescription(updatedProduct.getDescription());
    // product.setPrice(updatedProduct.getPrice());
    // Product savedProduct = productService.save(product);
    // return ResponseEntity.ok(savedProduct);
    // }else {
    // return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    // }
}

// @DeleteMapping("/{id}")
// public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
// Optional<Product> existingProduct = Repository.findById(id);
// if (existingProduct.isPresent()) {
// Repository.deleteById(id);
// return ResponseEntity.noContent().build();
// }
// }
