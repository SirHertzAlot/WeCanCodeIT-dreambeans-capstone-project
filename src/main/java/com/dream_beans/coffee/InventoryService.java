package com.dream_beans.coffee;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface InventoryService{
    void addItemToInventory(String productObject);
    List<String> listEntireInventory();
}
