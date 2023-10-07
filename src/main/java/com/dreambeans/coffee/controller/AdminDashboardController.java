package com.dreambeans.coffee.controller;

import com.dreambeans.coffee.models.Inventory;
import com.dreambeans.coffee.models.Menu;
import com.dreambeans.coffee.models.Product;
import com.dreambeans.coffee.service.InventoryService;
import com.dreambeans.coffee.service.MenuService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminDashboardController {
    @Resource
    private InventoryService inventoryService;

    @Resource
    private MenuService menuService;

    @GetMapping("/admin/inventory")
    public Iterable<Inventory> listEntireInventory() {
        return inventoryService.listEntireInventory();
    }

    @GetMapping("/admin/menu")
    public Iterable<Menu> listAllMenu() {
        return menuService.listAllMenu();
    }
}
