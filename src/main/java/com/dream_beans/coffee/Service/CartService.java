package com.dream_beans.coffee.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dream_beans.coffee.Repositories.CartRepository;
import com.dream_beans.coffee.models.Cart;

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