package com.ferro.mateus.kafka_w_spring_producer.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ferro.mateus.kafka_w_spring_producer.controller.dto.OrderDTO;
import com.ferro.mateus.kafka_w_spring_producer.domain.entity.Order;
import com.ferro.mateus.kafka_w_spring_producer.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<Order> postOrder(@RequestBody @Valid OrderDTO orderDTO)
            throws JsonProcessingException {
        return new ResponseEntity<>(orderService.postOrder(orderDTO), HttpStatus.CREATED);
    }
}
