package com.jersson.arrivasplata.swtvap.api.order.model;
import com.jersson.arrivasplata.swtvap.api.order.enums.Status;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "swtvap_orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long orderId;

    @Column(name = "client_id")
    private Long clientId;

    @Column(name = "code", length = 50)
    private String code;

    @Column(name = "code", length = 50)
    private String otherDate;

    @Enumerated(EnumType.ORDINAL)
    private Status status;

    @Column(name = "address", length = 250)
    private String address;

    @Column(name = "subtotal", precision = 10, scale = 2)
    private BigDecimal subtotal;

    @Column(name = "taxes", precision = 10, scale = 2)
    private BigDecimal taxes;

    @Column(name = "discount_amount", precision = 10, scale = 2)
    private BigDecimal discountAmount;

    @Column(name = "total", precision = 10, scale = 2)
    private BigDecimal total;

    @Column(name = "pick_up")
    private Boolean pickUp;

    @Column(columnDefinition = "TEXT")
    private String otherDetails;

    //Relación con Client    OrderClient /OrderTransaction  /orderDetails /orderProducts
    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Client client;
/*
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<OrderTransaction> orderTransactions;
*/
}
