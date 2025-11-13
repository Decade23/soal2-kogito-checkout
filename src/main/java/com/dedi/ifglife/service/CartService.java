package com.dedi.ifglife.service;

import com.dedi.ifglife.model.CheckoutRequest;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CartService {
    public void validateCart(CheckoutRequest req) {
        if (req.cartTotal <= 0) {
            throw new RuntimeException("INVALID_CART");
        }
    }
}
