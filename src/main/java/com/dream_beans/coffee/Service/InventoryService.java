package com.dream_beans.coffee.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dream_beans.coffee.Repositories.InventoryRepository;
import com.dream_beans.coffee.models.Product;

@Service
public class InventoryService{
    private InventoryRepository inventoryRepo; 
    
    public void addItemToInventory(Product product) {
        inventoryRepo.save(product);
    }

	public Iterable<Product> listEntireInventory() {
        return inventoryRepo.findAll();
    }

    public Optional<Product> findProductById(Long id) {
        return inventoryRepo.findById(id);
    }
}
