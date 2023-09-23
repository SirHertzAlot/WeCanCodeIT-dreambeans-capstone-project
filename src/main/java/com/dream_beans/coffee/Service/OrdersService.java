package com.dream_beans.coffee.Service;

import org.springframework.stereotype.Service;

import com.dream_beans.coffee.models.Orders;

@Service
public interface OrdersService {
    Iterable<Orders> getAllOrders();
}
