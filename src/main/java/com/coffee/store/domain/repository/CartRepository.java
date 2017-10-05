package com.coffee.store.domain.repository;

import com.coffee.store.domain.Cart;
import com.coffee.store.dto.CartDto;

public interface CartRepository {
    void create(CartDto cartDto);
    Cart read(String id);
    void update(String id, CartDto cartDto);
    void delete(String id);
    void addItem(String cartId, String productId);
    void removeItem(String cartId, String productId);
}
