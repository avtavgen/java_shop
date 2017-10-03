package com.coffee.store.domain.repository.impl;

import com.coffee.store.domain.Customer;
import com.coffee.store.domain.repository.CustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("ID1", "Mike", "NY"));
        customerList.add(new Customer("ID2", "Stan", "LA"));
        customerList.add(new Customer("ID3", "Bob", "VC"));
        return customerList;
    }
}
