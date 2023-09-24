package com.dream_beans.coffee.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dream_beans.coffee.Service.CustomerService;


@RestController
@RequestMapping
public class CustomerController {
    @Autowired
    CustomerService customerService;

    
    
}
