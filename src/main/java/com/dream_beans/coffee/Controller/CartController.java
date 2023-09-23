package com.dream_beans.coffee.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dream_beans.coffee.models.Cart;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    CartRepository repository;

    @GetMapping("/allcarts")
    public List<Cart> getAllCarts() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cart> getCartById(@PathVariable Long id) {
        Optional<Cart> cart = repository.findById(id);
        if (cart.isPresent()) {
            return ResponseEntity.ok(cart.get());
        } else {
            return ResponseEntity.notFound();
        }
    }

    // @PostMapping("/addItem")

    // @DeleteMapping("/removeItem/{id}")

    // @PutMapping("/updateQuantity/{id}")

    // @PostMapping("/save")

    // @GetMapping("/size")

}
