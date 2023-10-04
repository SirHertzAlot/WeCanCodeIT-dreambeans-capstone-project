// package com.dreambeans.coffee.controller;


// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.dreambeans.coffee.models.Cart;
// import com.dreambeans.coffee.service.CartService;

// @RestController
// @RequestMapping("/cart")
// public class CartController {
//     @Autowired
//     CartService cartService;
    

//     @GetMapping("/carts")
//     public Iterable<Cart> getAllCarts() {
//         return cartService.listAllCarts();
//     }

//     @GetMapping("/cart/{id}")
//     public ResponseEntity<Cart> getCartById(@PathVariable Long id) {
//         Optional<Cart> cart = cartService.findCartById(id);
//         if (cart.isPresent()) {
//             return ResponseEntity.ok(cart.get());
//         } else {
//             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//         }
//     }

//     // @PostMapping("/addItem")

//     // @DeleteMapping("/removeItem/{id}")

//     // @PutMapping("/updateQuantity/{id}")

//     // @PostMapping("/save")

//     // @GetMapping("/size")

// }
