package com.coffee.store.domain.repository;

import com.coffee.store.domain.Product;

import java.util.List;
import java.util.Map;

public interface ProductRepository {
    List<Product> getAllProducts();
    void updateStock(String productId, long noOfUnits);
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByFilter(Map<String, List<String>> filterParams);
    List<Product> filterProducts(String category, Map<String, List<String>> filterParams, String brand);
    Product getProductById(String productID);
    void addProduct(Product product);
}
