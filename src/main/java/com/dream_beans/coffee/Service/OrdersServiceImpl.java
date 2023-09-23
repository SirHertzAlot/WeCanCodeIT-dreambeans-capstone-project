package com.dream_beans.coffee.Service;

import org.springframework.stereotype.Service;

import com.dream_beans.coffee.Repository.OrdersRepository;
import com.dream_beans.coffee.models.Orders;

import java.util.Optional;

@Service
public class OrdersServiceImpl implements OrdersService {
    private OrdersRepository ordersRepository;

    public OrdersServiceImpl(OrdersRepository ordersRepository){
        super();
        this.ordersRepository = ordersRepository;
    }
    @Override
    public Iterable<Orders> getAllOrders() {
        return this.ordersRepository.findAll();
    }

    public Optional<Orders> findById(final Long id) {
      return this.ordersRepository.findById(id);
    }
}
