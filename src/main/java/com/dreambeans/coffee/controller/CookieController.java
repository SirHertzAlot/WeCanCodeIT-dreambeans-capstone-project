package com.dreambeans.coffee.controller;

import com.dreambeans.coffee.models.Customer;
import com.dreambeans.coffee.repositories.CustomerRepository;
import jakarta.annotation.Resource;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class CookieController {
    @Resource
    private CustomerRepository repo;

    protected void AddCookie(Customer customer, HttpServletResponse response){
        // for log out we need to set the values of cookie to 0
        Cookie cookie = new Cookie("userId", customer.toString());
        response.addCookie(cookie);
    }

    public void logout(HttpServletRequest request) {
        HttpSession httpSession = request.getSession();
        httpSession.invalidate();

    }
    protected Customer getCookieValue(HttpServletRequest request){
        Customer customer = null;

        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (int x = 0; x < cookies.length; x++) {
                if (cookies[x].getName().equals("userId")) {
                    Long id = Long.parseLong(cookies[x].getValue());
                    customer = repo.findById(id).get();
                }
            }
        }
        return customer;
    }
}
