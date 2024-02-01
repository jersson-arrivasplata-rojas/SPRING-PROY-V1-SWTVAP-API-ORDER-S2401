package com.jersson.arrivasplata.swtvap.api.order.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class OrderTransactionRequest {
    private Long orderTransactionId;
    private Long orderId;
    private String paymentMethod;
    private String amount;
    private LocalDate transactionDate;
}
