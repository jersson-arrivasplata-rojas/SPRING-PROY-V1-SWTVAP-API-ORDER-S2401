package com.jersson.arrivasplata.swtvap.api.order.model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
@Data
public class OrderTransactionResponse {
    private Long orderTransactionId;
    private Long orderId;
    private String paymentMethod;
    private BigDecimal amount;
    private String typeCurrency;
    private LocalDate transactionDate;
}
