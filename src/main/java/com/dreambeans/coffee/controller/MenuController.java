package com.dreambeans.coffee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dreambeans.coffee.models.Menu;
import com.dreambeans.coffee.models.Product;
import com.dreambeans.coffee.service.MenuService;

@RestController
@RequestMapping
public class MenuController {
    @Autowired
    MenuService menuService;

    @Autowired
    Menu menu;

    @GetMapping("/getProducts")
    public List<Product> getMenu() {
        return menu.getProducts();
    }
    
}
