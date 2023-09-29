package com.dreambeans.coffee.service;


import java.util.Optional;

import org.springframework.stereotype.Service;


import com.dreambeans.coffee.models.Menu;
import com.dreambeans.coffee.repositories.MenuRepository;


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
