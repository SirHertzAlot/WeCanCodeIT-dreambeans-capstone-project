package com.dreambeans.coffee.service;

import com.dreambeans.coffee.models.Orders;
import com.dreambeans.coffee.repositories.OrdersRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class  OrdersService {
    private OrdersRepository ordersRepository;

    public Iterable<Orders> getAllOrders() {
        return ordersRepository.findAll();
    }

    public Optional<Orders> findById(final Long id) {
    return ordersRepository.findById(id);
    }

}
