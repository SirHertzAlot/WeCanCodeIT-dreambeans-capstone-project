package com.dreambeans.coffee.repositories;

import com.dreambeans.coffee.models.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends CrudRepository<Orders, Long> { }
