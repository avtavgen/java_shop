package com.coffee.store.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

public class CartItemTest {

    private CartItem cartItem;
    private Cart cart;

    @Before
    public void setup() {
        cartItem = new CartItem("1");
        cartItem = new CartItem("2");
        cart = new Cart("Test Cart");
    }

    @Test
    public void cartItem_total_price_should_be_equal_to_product_unit_price_in_case_of_single_quantity() {
        //Arrange
        Product iphone = new Product("P1234","iPhone 5s", new BigDecimal(500));
        cartItem.setProduct(iphone);

        //Act
        BigDecimal totalPrice = cartItem.getTotalPrice();

        //Assert
        Assert.assertEquals(iphone.getUnitPrice(), totalPrice);
    }

    @Test
    public void cart_test_1() {
        Product iphone = new Product("P1234","iPhone 5s", new BigDecimal(500));
        cartItem.setProduct(iphone);
        ArrayList<CartItem> cartItems = new ArrayList<>();
        cartItems.add(cartItem);
        cart.setCartItems(cartItems);

        Assert.assertEquals(1, cart.getCartItems().size());
    }
}
