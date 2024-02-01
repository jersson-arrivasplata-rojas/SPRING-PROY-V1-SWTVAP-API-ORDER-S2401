package com.jersson.arrivasplata.swtvap.api.order.model;
import com.jersson.arrivasplata.swtvap.api.order.enums.Status;
import lombok.Data;
import java.math.BigDecimal;

@Data
public class OrderDetailResponse {
    private Long orderDetailId;
    private Long orderId;
    private Long productId;
    private Long quantity;
    private BigDecimal unitPrice;
    private BigDecimal subtotal;
    private Long discountPercentage;
    private String otherDetails;
    private Status status;
    private Order order;
    private Product Product;
}
