package com.dreambeans.coffee.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dreambeans.coffee.models.Customer;


@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
