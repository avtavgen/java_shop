package com.coffee.store.domain.repository;

import com.coffee.store.domain.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> getAllProducts();
    void updateStock(String productId, long noOfUnits);
}
