package com.jersson.arrivasplata.swtvap.api.order.model;

import com.jersson.arrivasplata.swtvap.api.order.enums.SourceAggregate;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "swtvap_clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long clientId;

    @Column(length = 50)
    private String name;

    @Column(length = 250)
    private String address;

    @Column(length = 20)
    private String phone;

    @Column(length = 20)
    private String cellphone;

    @Column(name="country_code", length = 5)
    private String countryCode;

    @Column(length = 50)
    private String email;

    @Column()
    private Boolean whatsapp;

    @Column(length = 250)
    private String details;

    @Column(name="other_details", columnDefinition = "TEXT")
    private String otherDetails;

    @Enumerated(EnumType.ORDINAL)
    private SourceAggregate sourceAggregate;
}
