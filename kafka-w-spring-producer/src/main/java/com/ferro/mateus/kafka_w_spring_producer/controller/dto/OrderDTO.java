package com.ferro.mateus.kafka_w_spring_producer.controller.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record OrderDTO(LocalDateTime date, String region, String status, BigDecimal total,
                       BigDecimal discount, BigDecimal shipping, BigDecimal tax) {
}
