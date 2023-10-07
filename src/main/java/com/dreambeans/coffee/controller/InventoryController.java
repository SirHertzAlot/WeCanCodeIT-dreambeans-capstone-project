 package com.dreambeans.coffee.controller;

 import com.dreambeans.coffee.models.Inventory;
 import com.dreambeans.coffee.service.InventoryService;
 import org.springframework.http.HttpStatus;
 import org.springframework.http.ResponseEntity;
 import org.springframework.web.bind.annotation.*;
 import org.springframework.web.servlet.ModelAndView;

 @RestController
 public class InventoryController {
    
     private InventoryService inventoryService;
     public InventoryController (InventoryService inventoryService) {
         this.inventoryService = inventoryService;
     }

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
     public Iterable<Inventory> inventory() {
         return inventoryService.listEntireInventory();
     }

    

     // @DeleteMapping("/{id}")
     // public ResponseEntity<Inve> deleteProduct(@PathVariable("id") long id) {
     //     Optional<Product> product = productRepository.findProductsById(id);

     //     if (product.isPresent()) {
     //         Product p = new Product();
     //         p.setId(id);
     //         productRepository.delete(p);
     //         return new ResponseEntity<>(p, HttpStatus.OK);
     //     } else {
     //         System.out.println("Id not found");
     //         return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        

     }


