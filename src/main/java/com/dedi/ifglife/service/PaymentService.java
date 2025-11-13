package com.dedi.ifglife.service;
import com.dedi.ifglife.model.CheckoutRequest;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PaymentService {
    public void processPayment(CheckoutRequest req, double totalWithShipping) {
        if ("FAIL".equalsIgnoreCase(req.paymentMethod)) {
            throw new RuntimeException("PAYMENT_FAILED");
        }
    }
}
