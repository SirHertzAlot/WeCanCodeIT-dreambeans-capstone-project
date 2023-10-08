package com.dreambeans.coffee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dreambeans.coffee.models.Product;
import com.dreambeans.coffee.models.Menu;
import com.dreambeans.coffee.service.ProductService;
import com.dreambeans.coffee.service.MenuService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminDashboardController {
    // @Resource
    // private ProductService productService;

    // @Resource
    // private MenuService menuService;

    // @GetMapping("/admin/inventory")
    // public Iterable<Product> listAllProducts() {
    //     return productService.listAllProducts();
    // }

    // @GetMapping("/admin/menu")
    // public Iterable<Menu> listAllMenu() {
    //     return menuService.listAllMenu();
    // }
}
