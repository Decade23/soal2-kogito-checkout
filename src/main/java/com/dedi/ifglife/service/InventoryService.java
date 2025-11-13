package com.dedi.ifglife.service;

import com.dedi.ifglife.model.CheckoutRequest;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class InventoryService {
    public void reserveInventory(CheckoutRequest req) {
        if (req.cartTotal > 1_000_000) {
            throw new RuntimeException("OUT_OF_STOCK");
        }
    }
}
