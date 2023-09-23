package com.dream_beans.coffee.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dream_beans.coffee.models.Product;

@Repository
public interface InventoryRepository extends CrudRepository<Product, Long> {
    List<Product> findAll();
}
