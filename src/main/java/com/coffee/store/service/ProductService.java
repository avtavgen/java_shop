package com.coffee.store.service;

import com.coffee.store.domain.Product;

import java.util.List;

public interface ProductService {
    void updateAllStock();
    List<Product> getAllProducts();
}
