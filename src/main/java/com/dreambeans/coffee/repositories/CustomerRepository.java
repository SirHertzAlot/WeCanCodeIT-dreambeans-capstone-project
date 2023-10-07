package com.dreambeans.coffee.repositories;

import com.dreambeans.coffee.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
