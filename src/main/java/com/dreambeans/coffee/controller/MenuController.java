package com.dreambeans.coffee.controller;

import com.dreambeans.coffee.models.Menu;
import com.dreambeans.coffee.service.MenuService;

import jakarta.servlet.http.HttpServletRequest;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This Menu Controller takes care of the client request
 */
@RestController
@RequestMapping("/api/menu")
public class MenuController extends CookieController {

    private MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    /**
     * get all the menu items from the urls
     * /api/menu/getAllMenus
     * /api/menu/
     * /api/menu
     * 
     * @return a list of menus
     * @throws Exception
     */
    @RequestMapping({ "/getAllMenus", "/", "" })
    public Iterable<Menu> getMenu(HttpServletRequest request) throws Exception {
        if (getCookieValue(request) == null) {
            throw new Exception("not logged in");
        }
        return menuService.listAllMenu();
    }

    /**
     * this gets the menu by Id
     * 
     * @param id this is the menu id from the url
     * @return this returns the menu
     * @throws Exception
     */
    @GetMapping("/{id}")
    public ResponseEntity<Menu> getByMenuId(@PathVariable Long id, HttpServletRequest request) throws Exception {
        if (getCookieValue(request) == null) {
            throw new Exception("not logged in");
        }
        Menu menu = null;
        Optional<Menu> menuOP = menuService.findMenuById(id);
        if (menuOP.isPresent()) {
            menu = menuOP.get();
            return ResponseEntity.ok(menu);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    /**
     * this method saves a menu to the repo
     * 
     * @param menu this is the menu to be saved in the repo
     * @return it returns a created status if created or a bad request if not
     *         created
     */
    @PostMapping("/save")
    public ResponseEntity<Menu> saveMenu(@RequestBody Menu menu, HttpServletRequest request) throws Exception {
        if (getCookieValue(request) == null) {
            throw new Exception("not logged in");
        }
        menu = menuService.saveMenu(menu);
        if (menu == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(menu);
    }

    /**
     * this deletes a menu by Id
     * 
     * @param id this is the Id to be deleted from the repo
     */
    @GetMapping("/delete/{id}")
    public void deleteMenuById(@PathVariable long id, HttpServletRequest request) throws Exception {
        if (getCookieValue(request) == null) {
            throw new Exception("not logged in");
        }
        menuService.deleteMenu(id);
    }

    /**
     * this method finds a menu by its name and returns it
     * 
     * @param name this is the name of the menu to be returned
     * @return this returns the menu
     */
    @GetMapping("/viewByName/{name}")
    public ResponseEntity<Menu> getByMenuName(@PathVariable String name, HttpServletRequest request) throws Exception {
        if (getCookieValue(request) == null) {
            throw new Exception("not logged in");
        }
        Menu menu = menuService.findName(name);
        if (menu == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(menu);

    }

}
