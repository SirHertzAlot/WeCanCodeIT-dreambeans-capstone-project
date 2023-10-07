package com.dreambeans.coffee.service;

import com.dreambeans.coffee.models.Customer;
import com.dreambeans.coffee.repositories.CustomerRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {
    @Resource
    private CustomerRepository customerRepository;

    public Customer saveCustomer(Customer customer){ return customerRepository.save(customer); }

    public Iterable<Customer> listAllCustomer() {
        return customerRepository.findAll();
    }

    public Optional<Customer> findCustomerById(Long id) {
        return customerRepository.findById(id);
    }
}