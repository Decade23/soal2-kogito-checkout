package com.dedi.ifglife.service;
import com.dedi.ifglife.model.CheckoutRequest;
import com.dedi.ifglife.model.CheckoutResponse;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.UUID;

@ApplicationScoped
public class OrderService {
    public void createOrder(CheckoutRequest req, CheckoutResponse resp) {
        resp.orderId = UUID.randomUUID().toString();
        resp.status = "SUCCESS";
    }

    public void sendConfirmation(CheckoutResponse resp) {
        // Dummy: kirim notif
    }
}
