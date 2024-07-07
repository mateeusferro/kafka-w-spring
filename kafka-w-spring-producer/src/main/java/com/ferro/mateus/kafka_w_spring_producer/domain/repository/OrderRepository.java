package com.ferro.mateus.kafka_w_spring_producer.domain.repository;

import com.ferro.mateus.kafka_w_spring_producer.domain.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID> {
}
