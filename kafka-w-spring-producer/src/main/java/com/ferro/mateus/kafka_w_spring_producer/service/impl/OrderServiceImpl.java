package com.ferro.mateus.kafka_w_spring_producer.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ferro.mateus.kafka_w_spring_producer.controller.dto.OrderDTO;
import com.ferro.mateus.kafka_w_spring_producer.domain.entity.Order;
import com.ferro.mateus.kafka_w_spring_producer.domain.repository.OrderRepository;
import com.ferro.mateus.kafka_w_spring_producer.producer.OrderProducer;
import com.ferro.mateus.kafka_w_spring_producer.producer.dto.OrderSenderDTO;
import com.ferro.mateus.kafka_w_spring_producer.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderProducer orderProducer;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order postOrder(OrderDTO orderDTO) throws JsonProcessingException {
        Order order = Order.builder()
                .date(orderDTO.date())
                .total(orderDTO.total())
                .region(orderDTO.region())
                .status(orderDTO.status())
                .discount(orderDTO.discount())
                .shipping(orderDTO.shipping())
                .tax(orderDTO.tax())
                .build();
        orderRepository.save(order);

        OrderSenderDTO orderSenderDTO = OrderSenderDTO.builder()
                .id(order.getId())
                .date(order.getDate())
                .total(order.getTotal())
                .region(order.getRegion())
                .build();
        orderProducer.sendOrder(orderSenderDTO);
        return order;
    }
}
