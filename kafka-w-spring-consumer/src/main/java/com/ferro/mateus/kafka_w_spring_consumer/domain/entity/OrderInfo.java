package com.ferro.mateus.kafka_w_spring_consumer.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Document("order_info")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderInfo {

    @MongoId
    private String id;

    private UUID orderId;

    private LocalDateTime orderDate;

    @Field(targetType = FieldType.DECIMAL128)
    private BigDecimal orderTotal;

    private String orderRegion;
}
