package com.dreambeans.coffee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dreambeans.coffee.models.Inventory;
import com.dreambeans.coffee.models.Menu;
import com.dreambeans.coffee.models.Product;
import com.dreambeans.coffee.repositories.InventoryRepository;

@Service
public class InventoryService{
    private InventoryRepository inventoryRepo; 
    
    // public void addItemToInventory(Product product) {
    //     inventoryRepo.save(product);
    // }

	public Iterable<Inventory> listEntireInventory() {
        return inventoryRepo.findAll();
    }

    public Optional<Inventory> findProductById(Long id) {
        return inventoryRepo.findById(id);
    }

}
