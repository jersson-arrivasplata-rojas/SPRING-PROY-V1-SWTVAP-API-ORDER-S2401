package com.jersson.arrivasplata.swtvap.api.order.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jersson.arrivasplata.swtvap.api.order.enums.Status;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Set;

@Data
@Entity
@Table(name = "swtvap_orders_details")
public class OrderDetail {

    @Column(name = "id")
    private Long orderDetailId;

    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "quantity")
    private Long quantity;

    @Column(name = "unit_price", precision = 10, scale = 2)
    private BigDecimal unitPrice;

    @Column(name = "subtotal", precision = 10, scale = 2)
    private BigDecimal subtotal;

    @Column(name = "discount_percentage")
    private Long discountPercentage;

    @Column(columnDefinition = "TEXT")
    private String otherDetails;

    @Enumerated(EnumType.ORDINAL)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Order order;

    @OneToMany(mappedBy = "product_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Product> product;

}
