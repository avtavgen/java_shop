package com.coffee.store.service;

import com.coffee.store.domain.Product;

import java.util.List;
import java.util.Map;

public interface ProductService {
    void updateAllStock();
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByFilter(Map<String, List<String>> filterParams);
    List<Product> filterProducts(String category, Map<String, List<String>> filterParams, String brand);
    Product getProductById(String productID);
    void addProduct(Product product);
}
