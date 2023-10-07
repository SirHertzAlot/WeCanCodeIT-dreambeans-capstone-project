package com.dreambeans.coffee.service;

import com.dreambeans.coffee.models.Customer;
import com.dreambeans.coffee.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;

    public Iterable<Customer> listAllCustomer() {
        return customerRepository.findAll();
    }

    public Optional<Customer> findCustomerById(Long id) {
        return customerRepository.findById(id);
    }
}