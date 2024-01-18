package com.jersson.arrivasplata.swtvap.api.order.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Set;

@Data
@Entity
@Table(name = "swtvap_orders_amounts")
public class OrderAmount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long orderAmountId;

    @Column(name = "order_id")
    private Long orderId;

    @Column(length = 50)
    private String name;

    @Column(name = "amount", precision = 10, scale = 2)
    private BigDecimal amount;

    @Column(columnDefinition = "TEXT")
    private String otherDetails;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Order> order;

}
