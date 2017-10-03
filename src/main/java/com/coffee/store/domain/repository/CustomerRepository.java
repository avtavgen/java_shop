package com.coffee.store.domain.repository;

import com.coffee.store.domain.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> getAllCustomers();
}
