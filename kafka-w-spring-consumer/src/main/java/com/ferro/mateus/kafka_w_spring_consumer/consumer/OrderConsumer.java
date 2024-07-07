package com.ferro.mateus.kafka_w_spring_consumer.consumer;

import com.ferro.mateus.kafka_w_spring_consumer.consumer.dto.OrderEvent;
import com.ferro.mateus.kafka_w_spring_consumer.service.OrderInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

    Logger logger = LoggerFactory.getLogger(OrderConsumer.class);

    @Autowired
    private OrderInfoService orderInfoService;

    @KafkaListener(topics = "order", groupId = "order-group-1")
    public void consumer(OrderEvent message) {
        logger.info(message.toString());
        orderInfoService.saveInfo(message);
    }
}
