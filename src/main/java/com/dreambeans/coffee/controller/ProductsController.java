package com.dreambeans.coffee.controller;

import com.dreambeans.coffee.models.*;
import com.dreambeans.coffee.service.*;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductsController extends CookieController {

    private ProductService productService;
    private MenuService menuService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/allproducts/{menuId}")
    public Iterable<Product> getAllProducts(@PathVariable Long menuId, HttpServletRequest request) throws Exception {
        // if (getCookieValue(request) == null) {
        //     throw new Exception("not logged in");
        // }
        return productService.listProductsByMenuId(menuId);
    }

    @GetMapping("/allproducts")
    public Iterable<Product> getAllProducts(HttpServletRequest request) throws Exception {
        // if (getCookieValue(request) == null) {
        //     throw new Exception("not logged in");
        // }
        return productService.listAllProducts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable Long id, HttpServletRequest request)
            throws Exception {
        if (getCookieValue(request) == null) {
            throw new Exception("not logged in");
        }
        ProductDto productDto = null;
        Optional<Product> productOp = productService.findProductsById(id);
        if (productOp.isPresent()) {
            Product product = productOp.get();
            productDto = new ProductDto(product.getId(), product.getPrice(), product.getDescription(),
                    product.getName(), product.getImage(), product.getQuantity(), product.getMenu().getId());
            return ResponseEntity.ok(productDto);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<?> deleteProductById(@PathVariable Long id, HttpServletRequest request) throws Exception {
        if (getCookieValue(request) == null) {
            throw new Exception("not logged in");
        }
        productService.deleteProductById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * this method can be used to create and save a product
     * if the product id is 0 it will create a new product in the repository
     * if the product id is not 0 it will update the product
     * 
     * @param productDto
     * @return
     */
    @PostMapping("/save")
    public ResponseEntity<Product> createProduct(@RequestBody ProductDto productDto, HttpServletRequest request)
            throws Exception {
        if (getCookieValue(request) == null) {
            throw new Exception("not logged in");
        }
        Menu menu = menuService.findMenuById(productDto.getMenuId()).get();
        Product product = new Product(productDto.getPrice(), productDto.getDescription(), productDto.getName(),
                productDto.getImage(), productDto.getQuantity(), menu);
        product.setId(productDto.getId());
        Product savedProduct = productService.saveProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedProduct);
    }
/**
 * update the quantity for the product 
 * @param id this is the id for the product
 * @param quantity this is the quantity 
 * @return returns the new quantity

 */
    @GetMapping("/updateQuantity/{id}/{quantity}")
    public ResponseEntity<Integer> updateQuantity(@PathVariable("id") int id, @PathVariable("quantity") int quantity,
            HttpServletRequest request) throws Exception {
        if (getCookieValue(request) == null) {
            throw new Exception("not logged in");
        }
        Optional<Product> productOP = productService.findProductsById(null);
        if (productOP.isPresent()) {
            Product product = productOP.get();
            product.setQuantity(quantity);
            product = productService.saveProduct(product);
            return ResponseEntity.status(HttpStatus.OK).body(product.getQuantity());
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}