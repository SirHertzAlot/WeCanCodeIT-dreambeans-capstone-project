package com.dream_beans.coffee.Service;

import java.util.List;

import com.dream_beans.coffee.Repository.InventoryRepository;

public class InventoryServiceImpl implements InventoryService {

    private InventoryRepository repository;

    @Override
    public void addItemToInventory(String productObject) {
        repository.save(productObject);
    }

	@Override
	public List<String> listEntireInventory() {
        return repository.findAll();
    }
    
}
