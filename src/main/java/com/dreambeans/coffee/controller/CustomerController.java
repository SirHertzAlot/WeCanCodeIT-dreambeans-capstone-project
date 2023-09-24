package com.dreambeans.coffee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dreambeans.coffee.service.CustomerService;


@RestController
@RequestMapping
public class CustomerController {
    @Autowired
    CustomerService customerService;

    
    
}
