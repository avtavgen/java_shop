package com.coffee.store.service.impl;

import com.coffee.store.domain.Customer;
import com.coffee.store.domain.repository.CustomerRepository;
import com.coffee.store.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.getAllCustomers();
    }
}
