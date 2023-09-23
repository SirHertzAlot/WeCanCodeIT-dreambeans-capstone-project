package com.dream_beans.coffee.Controller;
import com.dream_beans.coffee.InventoryServiceImpl;
import com.dream_beans.coffee.models.Inventory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
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
    public List<Inventory> inventory() { return inventoryService.listEntireInventory(); }
}