package com.coffee.store.validator;

import com.coffee.store.domain.Product;
import com.coffee.store.exception.ProductNotFoundException;
import com.coffee.store.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ProductIdValidator implements ConstraintValidator<ProductId, String> {

    @Autowired
    private ProductService productService;

    public void initialize(ProductId constraintAnnotation) {
        // intentionally left blank; this is the place to initialize the constraint annotation for any sensible default values.
    }

    public boolean isValid(String value, ConstraintValidatorContext context) {

        Product product;

        try {
            product = productService.getProductById(value);
        } catch (ProductNotFoundException e) {
            return true;
        }

        if (product != null) {
            return false;
        }

        return true;
    }
}
