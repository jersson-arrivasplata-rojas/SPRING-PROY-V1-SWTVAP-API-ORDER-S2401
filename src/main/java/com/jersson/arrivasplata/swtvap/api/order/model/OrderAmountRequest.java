package com.jersson.arrivasplata.swtvap.api.order.model;

import com.jersson.arrivasplata.swtvap.api.order.enums.Status;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Set;

@Data
public class OrderAmountRequest {
    private Long orderAmountId;
    private Long orderId;
    private String name;
    private BigDecimal amount;
    private String otherDetails;

}
