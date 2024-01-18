package com.jersson.arrivasplata.swtvap.api.order.model;

import com.jersson.arrivasplata.swtvap.api.order.enums.Status;
import jakarta.persistence.*;

import java.math.BigDecimal;

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long productId;

    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "code", length = 50)
    private String code;

    @Column(name = "name", length = 200)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(name = "price", precision = 10, scale = 2)
    private BigDecimal price;

    @Column(name = "stock")
    private Long stock;

    @Column(name = "stock_min")
    private Long stockMin;

    @Column(columnDefinition = "TEXT")
    private String otherDetails;

    @Enumerated(EnumType.ORDINAL)
    private Status status;
}
