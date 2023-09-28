package com.dreambeans.coffee.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dreambeans.coffee.models.Cart;
import com.dreambeans.coffee.repositories.CartRepository;

@Service
public class CartService {
    private CartRepository cartRepo;

    public Iterable<Cart> listAllCarts() {
        return cartRepo.findAll();
    }

    public Optional<Cart> findCartById(Long id) {
        return cartRepo.findById(id);
    }
}