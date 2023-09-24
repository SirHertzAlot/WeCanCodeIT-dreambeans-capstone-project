package com.dream_beans.coffee.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dream_beans.coffee.Repositories.OrdersRepository;
import com.dream_beans.coffee.models.Orders;


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
