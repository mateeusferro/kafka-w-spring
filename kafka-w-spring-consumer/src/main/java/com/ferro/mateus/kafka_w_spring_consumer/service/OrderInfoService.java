package com.ferro.mateus.kafka_w_spring_consumer.service;

import com.ferro.mateus.kafka_w_spring_consumer.consumer.dto.OrderEvent;

public interface OrderInfoService {

    void saveInfo(OrderEvent message);
}
