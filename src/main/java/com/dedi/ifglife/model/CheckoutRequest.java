package com.dedi.ifglife.model;

public class CheckoutRequest {

    public String cartId;
    public String customerId;
    public double cartTotal;
    public String paymentMethod;
    public String shippingAddress;

    public CheckoutRequest() {}
}
