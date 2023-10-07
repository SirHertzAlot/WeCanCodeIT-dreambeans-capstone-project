 package com.dreambeans.coffee.controller;

 import com.dreambeans.coffee.models.Menu;
 import com.dreambeans.coffee.service.MenuService;
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RestController;

 @RestController
 @RequestMapping("/api")
 public class MenuController {

     private MenuService menuService;

     public MenuController(MenuService menuService){ this.menuService = menuService; }

     @GetMapping("/getProducts")
     public Iterable<Menu> getMenu() {
         return menuService.listAllMenu();
     }
    
 }
