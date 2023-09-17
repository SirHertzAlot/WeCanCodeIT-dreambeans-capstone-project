package com.dream_beans.coffee;

import org.springframework.stereotype.Service;

@Service
public interface OrdersService {
    Iterable<Orders> getAllOrders();
}
