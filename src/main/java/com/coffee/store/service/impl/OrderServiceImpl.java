package com.coffee.store.service.impl;

import com.coffee.store.domain.Order;
import com.coffee.store.domain.repository.OrderRepository;
import com.coffee.store.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Long saveOrder(Order order) {
        return orderRepository.saveOrder(order);
    }
}
