package com.coffee.store.domain.repository;

import com.coffee.store.domain.Order;

public interface OrderRepository {
    long saveOrder(Order order);
}
