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
    public Iterable<Object> inventory() {
        return inventoryService.listEntireInventory();
    }

    @PostMapping("/add")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        Product _product = productRepository
                .save(new Product());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Product> deleteProduct(@PathVariable("id") long id) {
        Optional<Product> product = productRepository.findById(id);

        if (product.isPresent()) {
            Product p = new Product();
            p.setId(id);
            productRepository.delete(p);
            return new ResponseEntity<>(p, HttpStatus.OK);
        } else {
            System.out.println("Id not found");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }

}
