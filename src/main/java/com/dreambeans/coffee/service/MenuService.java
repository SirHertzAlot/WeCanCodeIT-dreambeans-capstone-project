package com.dreambeans.coffee.service;


import com.dreambeans.coffee.models.Menu;
import com.dreambeans.coffee.models.Product;
import com.dreambeans.coffee.repositories.MenuRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class MenuService{
    private MenuRepository menuRepo;
	
    public Optional<Menu> findProductById(Long id) {
        return menuRepo.findById(id);
    }

    	public Iterable<Menu> listAllMenu() {
        return menuRepo.findAll();
    }
}
