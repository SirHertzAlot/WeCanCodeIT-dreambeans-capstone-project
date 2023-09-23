package com.dream_beans.coffee.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dream_beans.coffee.models.Orders;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
