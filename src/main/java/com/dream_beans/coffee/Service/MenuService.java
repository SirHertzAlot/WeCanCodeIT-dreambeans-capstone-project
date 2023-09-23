package com.dream_beans.coffee.Service;


import java.util.Optional;

import org.springframework.stereotype.Service;


import com.dream_beans.coffee.Repositories.MenuRepository;
import com.dream_beans.coffee.models.Menu;


@Service
public class MenuService{
    private MenuRepository menuRepo; 
    


	
    public Optional<Menu> findProductById(Long id) {
        return menuRepo.findById(id);
    }
}
