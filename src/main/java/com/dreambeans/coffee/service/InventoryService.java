package com.dreambeans.coffee.service;

import com.dreambeans.coffee.models.Inventory;
import com.dreambeans.coffee.repositories.InventoryRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
