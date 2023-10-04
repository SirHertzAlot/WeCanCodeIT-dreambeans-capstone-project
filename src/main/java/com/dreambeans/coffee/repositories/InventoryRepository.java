package com.dreambeans.coffee.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dreambeans.coffee.models.Inventory;
import com.dreambeans.coffee.models.Product;

@Repository
public interface InventoryRepository extends CrudRepository<Inventory, Long> {

   public void addProduct(Product product);

}
