package com.dreambeans.coffee.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dreambeans.coffee.models.Product;

@Repository
public interface ProductsRepository extends CrudRepository<Product, Long> {
    Iterable<Product> findByMenuId(Long menuId);

}
