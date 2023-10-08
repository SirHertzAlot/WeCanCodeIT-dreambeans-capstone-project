package com.dreambeans.coffee.service;

import com.dreambeans.coffee.models.Cart;
import com.dreambeans.coffee.models.Menu;
import com.dreambeans.coffee.models.Product;
import com.dreambeans.coffee.repositories.MenuRepository;

import jakarta.annotation.Resource;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MenuService {
    @Resource
    private MenuRepository menuRepo;


    public Menu saveMenu(Menu menu) {
        return menuRepo.save(menu);
    }
/**
 * this finds the menu by an Id
 * @param id this is the menu Id
 * @return this returns back a menu
 */


    public Optional<Menu> findMenuById(Long id) {
        return menuRepo.findById(id);
    }

    public Iterable<Menu> listAllMenu() {
        return menuRepo.findAll();
    }

    // view by name

    public void deleteMenu(Long id) {
        menuRepo.deleteById(id);
    }

    public Menu findName(String name) {
        return menuRepo.findByName(name);
    }

}
