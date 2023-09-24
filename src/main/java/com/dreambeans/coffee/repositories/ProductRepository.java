package com.dreambeans.coffee.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dreambeans.coffee.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

}
