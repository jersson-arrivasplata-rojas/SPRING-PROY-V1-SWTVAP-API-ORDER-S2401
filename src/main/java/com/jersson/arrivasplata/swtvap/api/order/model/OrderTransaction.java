package com.jersson.arrivasplata.swtvap.api.order.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "swtvap_orders_transactionss")
public class OrderTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long orderTransactionId;

    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "payment_method", length = 50)
    private String paymentMethod;

    @Column(name = "amount", length = 50)
    private String amount;

    @Column(name = "transaction_date")
    private LocalDate transactionDate;

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Order order;

}
