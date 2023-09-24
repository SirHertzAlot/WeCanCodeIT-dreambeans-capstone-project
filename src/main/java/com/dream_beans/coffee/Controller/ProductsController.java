
package com.dream_beans.coffee.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dream_beans.coffee.Service.ProductService;
import com.dream_beans.coffee.models.Product;

@RestController
@RequestMapping("/products")
public class ProductsController {
    @Autowired
    ProductService productService;

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
