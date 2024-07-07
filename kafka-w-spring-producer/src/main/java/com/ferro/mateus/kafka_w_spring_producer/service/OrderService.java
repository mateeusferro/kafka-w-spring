package com.ferro.mateus.kafka_w_spring_producer.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ferro.mateus.kafka_w_spring_producer.controller.dto.OrderDTO;
import com.ferro.mateus.kafka_w_spring_producer.domain.entity.Order;

public interface OrderService {

    Order postOrder(OrderDTO orderDTO) throws JsonProcessingException;
}
