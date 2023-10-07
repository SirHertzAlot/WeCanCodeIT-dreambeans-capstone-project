package com.dreambeans.coffee.service;

import com.dreambeans.coffee.models.Cart;
import com.dreambeans.coffee.repositories.CartRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

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