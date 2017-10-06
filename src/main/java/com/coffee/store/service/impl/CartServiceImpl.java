package com.coffee.store.service.impl;

import com.coffee.store.domain.Cart;
import com.coffee.store.domain.repository.CartRepository;
import com.coffee.store.dto.CartDto;
import com.coffee.store.exception.InvalidCartException;
import com.coffee.store.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;

    public void create(CartDto cartDto) {
        cartRepository.create(cartDto);
    }

    @Override
    public Cart read(String id) {
        return cartRepository.read(id);
    }

    @Override
    public void update(String id, CartDto cartDto) {
        cartRepository.update(id, cartDto);
    }

    @Override
    public void delete(String id) {
        cartRepository.delete(id);
    }

    @Override
    public void addItem(String cartId, String productId) {
        cartRepository.addItem(cartId, productId);
    }

    @Override
    public void removeItem(String cartId, String productId) {
        cartRepository.removeItem(cartId, productId);
    }

    @Override
    public Cart validate(String cartId) {
        Cart cart = cartRepository.read(cartId);

        if(cart == null || cart.getCartItems().size() == 0) {
            throw new InvalidCartException(cartId);
        }

        return cart;
    }

    @Override
    public void clearCart(String cartId) {
        cartRepository.clearCart(cartId);
    }
}
