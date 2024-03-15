package com.jersson.arrivasplata.swtvap.api.order.model;

import com.jersson.arrivasplata.swtvap.api.order.enums.Status;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "swtvap_products")
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

    @Column(name = "name_en", length = 200)
    private String nameEn;

    @Column(name = "description_en", columnDefinition = "TEXT")
    private String descriptionEn;

    @Column(name = "price", precision = 50, scale = 10)
    private BigDecimal price;

    @Column(name = "priceUSD", precision = 50, scale = 10)
    private BigDecimal priceUSD;

    @Column(name = "priceEUR", precision = 50, scale = 10)
    private BigDecimal priceEUR;

    @Column(name = "stock")
    private Long stock;

    @Column(name = "stock_min")
    private Long stockMin;

    @Column(columnDefinition = "TEXT")
    private String otherDetails;

    @Column(name = "otherDetails_en", columnDefinition = "TEXT")
    private String otherDetails_en;

    @Enumerated(EnumType.ORDINAL)
    private Status status;

    @Column(name = "deleted_at")
    private LocalDate deletedAt;
/*
    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id", insertable = false, updatable = false)
    private OrderDetail orderDetail;
*/

}
