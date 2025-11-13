package com.dedi.ifglife;

import com.dedi.ifglife.model.CheckoutRequest;
import com.dedi.ifglife.model.CheckoutResponse;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.junit.jupiter.api.Test;
import org.kie.kogito.process.Process;
import org.kie.kogito.process.ProcessInstance;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class CheckoutProcessTest {

    @Inject
    @Named("checkout")
    Process<org.kie.kogito.process.ProcessInstance> checkout;

    @Test
    void testCheckoutSuccess() {

        CheckoutRequest req = new CheckoutRequest();
        req.cartId = "CART-1";
        req.customerId = "CUST-1";
        req.cartTotal = 100;
        req.paymentMethod = "CARD";
        req.shippingAddress = "Jakarta";

        CheckoutResponse resp = new CheckoutResponse();

        Map<String, Object> params = new HashMap<>();
        params.put("checkoutRequest", req);
        params.put("checkoutResponse", resp);

        ProcessInstance<?> pi = checkout.createInstance(params);
        pi.start();

        assertEquals(ProcessInstance.STATE_COMPLETED, pi.status());
        assertEquals("SUCCESS", resp.status);
        assertNotNull(resp.orderId);
    }
}
