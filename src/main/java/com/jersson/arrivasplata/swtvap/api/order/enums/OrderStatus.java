package com.jersson.arrivasplata.swtvap.api.order.enums;

public enum OrderStatus {
    PENDING_PAYMENT("The order has been placed by the customer, but payment has not been completed."),
    PAYMENT_RECEIVED("Payment for the order has been received and confirmed."),
    PROCESSING("The products in the order are being gathered and prepared for shipment."),
    IN_TRANSIT("The order has been shipped and is on its way to the specified shipping address."),
    DELIVERED("The order has been successfully delivered to the customer."),
    CANCELED_BY_CUSTOMER("The customer has requested to cancel the order before shipment."),
    CANCELED_BY_COMPANY("The company has canceled the order for internal reasons such as lack of stock, payment issues, etc."),
    WAITING_FOR_PAYMENT_CONFIRMATION("The order has been placed, but the company is waiting for payment confirmation before proceeding."),
    REFUNDED("The order has been refunded to the customer, either partially or in full."),
    CUSTOMS_PROCESSING("The order is undergoing customs clearance before international shipment."),
    WAITING_FOR_DOCUMENTATION("The order is pending necessary documentation for export."),
    INTERNATIONAL_TRANSIT("The order has left the country and is en route to its international destination."),
    HELD_IN_CUSTOMS("The order has arrived at the destination country but is being held in customs for inspection or other procedures.");

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
