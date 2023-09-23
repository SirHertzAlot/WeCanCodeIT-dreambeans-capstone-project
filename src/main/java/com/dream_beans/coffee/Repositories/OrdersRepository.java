package com.dream_beans.coffee.Repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dream_beans.coffee.models.Orders;

@Repository
public interface OrdersRepository extends CrudRepository<Orders, Long> {

}
