package com.dream_beans.coffee.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.dream_beans.coffee.Service.InventoryServiceImpl;

@RestController
public class InventoryController {
    
    private InventoryServiceImpl inventoryService;

    @RequestMapping(value = "/api/inventory", method = RequestMethod.GET)
    public ModelAndView listEntireInventory(){
        ModelAndView coffeeInventory = new ModelAndView("inventory");
        coffeeInventory.addObject("inventory", inventoryService.listEntireInventory());
        return coffeeInventory;
    }

    @GetMapping(value = "inventory")
    ResponseEntity<String> test(){
        return new ResponseEntity<>("Was this test successful?", HttpStatus.OK);
    }

    @ModelAttribute("/api/inventory")
    public Iterable<Object> inventory() { return inventoryService.listEntireInventory(); }
}
