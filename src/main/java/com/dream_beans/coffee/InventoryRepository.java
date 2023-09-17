package com.dream_beans.coffee;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends CrudRepository<String, Long> {
    List<String> findAll();
}
