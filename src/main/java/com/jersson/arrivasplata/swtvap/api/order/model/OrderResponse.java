package com.jersson.arrivasplata.swtvap.api.order.model;

import com.jersson.arrivasplata.swtvap.api.order.enums.Status;
import lombok.Data;

import java.math.BigDecimal;
@Data
public class OrderResponse {
    private Long orderId;
    private Long clientId;
    private String code;
    private String otherDate;
    private Status status;
    private String address;
    private BigDecimal subtotal;
    private BigDecimal taxes;
    private BigDecimal discountAmount;
    private BigDecimal total;
    private Boolean pickUp;
    private String otherDetails;
}
