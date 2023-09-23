package com.dream_beans.coffee.Repository;

import org.springframework.data.repository.CrudRepository;

import com.dream_beans.coffee.models.Cart;

public interface CartRepository extends CrudRepository<Cart, Long> {

}