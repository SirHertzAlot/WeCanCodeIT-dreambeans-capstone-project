package com.dreambeans.coffee.service;

import com.dreambeans.coffee.models.Cart;
import com.dreambeans.coffee.repositories.CartRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartService {
    @Resource
    private CartRepository cartRepo;

    public Cart saveCart(Cart cart) { return cartRepo.save(cart); }
    public Iterable<Cart> listAllCarts() {
        return cartRepo.findAll();
    }

    public Optional<Cart> findCartById(Long id) {
        return cartRepo.findById(id);
    }
}