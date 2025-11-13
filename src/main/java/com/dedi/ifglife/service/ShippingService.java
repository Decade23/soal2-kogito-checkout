package com.dedi.ifglife.service;
import com.dedi.ifglife.model.CheckoutRequest;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ShippingService {
    public double calculateShipping(CheckoutRequest req) {
        return 25.0;
    }
}
