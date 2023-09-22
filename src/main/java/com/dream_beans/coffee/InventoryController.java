package com.dream_beans.coffee;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class InventoryController {

    private InventoryServiceImpl inventoryService;

    @RequestMapping(value = "/api/inventory", method = RequestMethod.GET)
    public ModelAndView listEntireInventory() {
        ModelAndView coffeeInventory = new ModelAndView("inventory");
        coffeeInventory.addObject("inventory", inventoryService.listEntireInventory());
        return coffeeInventory;
    }

    @GetMapping(value = "inventory")
    ResponseEntity<String> test() {
        return new ResponseEntity<>("Was this test successful?", HttpStatus.OK);
    }

    @ModelAttribute("/api/inventory")
    public Iterable<Object> inventory() {
        return inventoryService.listEntireInventory();
    }

    @PostMapping("/add")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        Product _product = productRepository
                .save(new Product());
        return new ResponseEntity<>(HttpStatus.CREATED)
    }
}
