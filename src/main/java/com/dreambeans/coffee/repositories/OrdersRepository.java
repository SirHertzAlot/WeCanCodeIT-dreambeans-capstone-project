package com.dreambeans.coffee.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dreambeans.coffee.models.Orders;

@Repository
public interface OrdersRepository extends CrudRepository<Orders, Long> {

}
