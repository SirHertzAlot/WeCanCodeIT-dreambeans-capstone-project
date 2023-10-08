package com.dreambeans.coffee.controller;

import com.dreambeans.coffee.models.*;
import com.dreambeans.coffee.service.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

    private ProductService productService;
    private MenuService menuService;

    
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/allproducts/{menuId}")
    public Iterable<Product> getAllProducts(@PathVariable Long menuId) {
        return productService.listAllProducts(menuId);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable Long id) {
        ProductDto productDto = null;
        Optional<Product> productOp = productService.findProductsById(id);
        if (productOp.isPresent()) {
            Product product = productOp.get();
            productDto = new ProductDto(product.getId(), product.getPrice(), product.getDescription(),product.getName(), product.getImage(),product.getQuantity(), product.getMenu().getId());
            return ResponseEntity.ok(productDto);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
    @GetMapping("/delete/{id}")
    public ResponseEntity<?> deleteProductById(@PathVariable Long id) {
        productService.deleteProductById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    /**
     * this method can be used to create and save a product
     * if the product id is 0 it will create a new product in the repository
     * if the product id is not 0 it will update the product
     * @param productDto
     * @return
     */
    @PostMapping("/save")
    public ResponseEntity<Product> createProduct(@RequestBody ProductDto productDto) {
        Menu menu = menuService.findMenuById(productDto.getMenuId()).get();
        Product product = new Product(productDto.getPrice(), productDto.getDescription(), productDto.getName(), productDto.getImage(), productDto.getQuantity(), menu);
        product.setId(productDto.getId());
        Product savedProduct = productService.saveProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedProduct);
    }

    // @GetMapping("/product")
    // public Product getOneProduct() {
    // Product latte = new Product(3.99, "latte", "hot coffee",
    // "https://www.allrecipes.com/thmb/Dq9kocJWJNmhfPotGiZT6Tl_r1w=/750x0/filters:no_upscale([…]):format(webp)/9428203-9d140a4ed1424824a7ddd358e6161473.jpg");
    // return latte;
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
