package com.dreambeans.coffee.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dreambeans.coffee.models.Cart;

@Repository
public interface CartRepository extends CrudRepository<Cart, Long> {

}