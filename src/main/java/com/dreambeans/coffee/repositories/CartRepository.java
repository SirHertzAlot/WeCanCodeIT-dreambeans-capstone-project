package com.dreambeans.coffee.repositories;


import com.dreambeans.coffee.models.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Long> {

}