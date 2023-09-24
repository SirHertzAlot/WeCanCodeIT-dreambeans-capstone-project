package com.dream_beans.coffee.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dream_beans.coffee.Repositories.CustomerRepository;

import com.dream_beans.coffee.models.Customer;

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