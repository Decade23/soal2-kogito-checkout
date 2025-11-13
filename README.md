# Soal 2 - Kogito Checkout Process dengan Quarkus

## Proyek ini berisi proses BPMN untuk alur checkout marketplace:

1. Validate Cart
2. Reserve Inventory
3. Calculate Shipping
4. Process Payment
5. Create Order
6. Send Confirmation

Engine workflow yang digunakan adalah **Kogito** di dalam **Quarkus**.

## Teknologi
- Java 17
- Quarkus 3.x
- Kogito Workflow (kogito-quarkus + kogito-processes)
- JUnit + Quarkus Test

## Menjalankan

```bash
mvn clean test
mvn quarkus:dev

Workflow engine REST endpoint:
POST /checkout
example payload:
{
  "checkoutRequest": {
    "cartId": "CART-1",
    "customerId": "CUST-1",
    "cartTotal": 100,
    "paymentMethod": "CARD",
    "shippingAddress": "Jakarta"
  }
}

Proyek ini dibuat untuk menunjukkan integrasi BPMN workflow dengan kode Java menggunakan Kogito.
```