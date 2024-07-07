package com.ferro.mateus.kafka_w_spring_consumer.domain.repository;

import com.ferro.mateus.kafka_w_spring_consumer.domain.entity.OrderInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderInfoRepository extends MongoRepository<OrderInfo, String> {
}
