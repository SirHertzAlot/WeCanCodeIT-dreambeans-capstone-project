package com.dreambeans.coffee.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dreambeans.coffee.models.Inventory;

@Repository
public interface InventoryRepository extends CrudRepository<Inventory, Long> {

}
