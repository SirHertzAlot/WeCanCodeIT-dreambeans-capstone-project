// package com.dreambeans.coffee.controller;

// import java.util.List;
// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;
// import org.springframework.web.servlet.ModelAndView;

// import com.dreambeans.coffee.models.Inventory;
// import com.dreambeans.coffee.models.Product;
// import com.dreambeans.coffee.repositories.ProductRepository;
// import com.dreambeans.coffee.service.InventoryService;

// @RestController
// public class InventoryController {
    
//     private InventoryService inventoryService;
//     private ProductRepository productRepository;
//     private Inventory inventory;

//     public InventoryController (InventoryService inventoryService, ProductRepository productRepository, Inventory inventory) {
//         this.inventoryService = inventoryService;
//         this.productRepository = productRepository;
//         this.inventory = inventory;
//     }

//      @GetMapping("/getProducts")
//     public List<Product> getMenu() {
//         return inventory.getProducts();
//     }

//     @RequestMapping(value = "/api/inventory", method = RequestMethod.GET)
//     public ModelAndView listEntireInventory(){
//         ModelAndView coffeeInventory = new ModelAndView("inventory");
//         coffeeInventory.addObject("inventory", inventoryService.listEntireInventory());
//         return coffeeInventory;
//     }

//     @GetMapping(value = "inventory")

//     ResponseEntity<String> test(){
//         return new ResponseEntity<>("Was this test successful?", HttpStatus.OK);
//     }

//     @ModelAttribute("/api/inventory")
//     public Iterable<Inventory> inventory() {
//         return inventoryService.listEntireInventory();
//     }

    

//     // @DeleteMapping("/{id}")
//     // public ResponseEntity<Inve> deleteProduct(@PathVariable("id") long id) {
//     //     Optional<Product> product = productRepository.findProductsById(id);

//     //     if (product.isPresent()) {
//     //         Product p = new Product();
//     //         p.setId(id);
//     //         productRepository.delete(p);
//     //         return new ResponseEntity<>(p, HttpStatus.OK);
//     //     } else {
//     //         System.out.println("Id not found");
//     //         return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        

//     }


