package com.coffee.store.service.impl;

import com.coffee.store.domain.Product;
import com.coffee.store.domain.repository.ProductRepository;
import com.coffee.store.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    @Override
    public void updateAllStock() {
        List<Product> allProducts = productRepository.getAllProducts();
        for(Product product : allProducts) {
            if(product.getUnitsInStock()<500)
                productRepository.updateStock(product.getProductId(),product.getUnitsInStock() + 1000);
        }
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        return productRepository.getProductsByCategory(category);
    }

    @Override
    public List<Product> getProductsByFilter(Map<String, List<String>> filterParams) {
        return productRepository.getProductsByFilter(filterParams);
    }

    @Override
    public Product getProductById(String productID) {
        return productRepository.getProductById(productID);
    }

    @Override
    public List<Product> filterProducts(String category, Map<String, List<String>> filterParams, String brand) {
        return productRepository.filterProducts(category, filterParams, brand);
    }

    @Override
    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }
}
