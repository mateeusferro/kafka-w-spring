package com.ferro.mateus.kafka_w_spring_consumer.consumer.dto;

import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Builder
public record OrderEvent(UUID id, LocalDateTime date, BigDecimal total, String region) {
}
