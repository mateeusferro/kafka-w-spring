package com.ferro.mateus.kafka_w_spring_producer.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "orders")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "order_id")
    private UUID id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "order_date")
    private LocalDateTime date;

    @Column(name = "order_region")
    private String region;

    @Column(name = "order_total")
    private BigDecimal total;

    @Column(name = "order_status")
    private String status;

    @Column(name = "order_discount")
    private BigDecimal discount;

    @Column(name = "order_shipping")
    private BigDecimal shipping;

    @Column(name = "order_tax")
    private BigDecimal tax;
}
