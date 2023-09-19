package com.dream_beans.coffee;

import java.util.List;

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
