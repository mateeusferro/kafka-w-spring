package com.ferro.mateus.kafka_w_spring_producer.producer.dto;

import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Builder
public record OrderSenderDTO(UUID id, LocalDateTime date, BigDecimal total, String region) {
}
