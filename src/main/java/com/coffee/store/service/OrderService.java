package com.coffee.store.service;

import com.coffee.store.domain.Order;

public interface OrderService {
    Long saveOrder(Order order);
}
