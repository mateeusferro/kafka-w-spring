package com.ferro.mateus.kafka_w_spring_producer.producer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ferro.mateus.kafka_w_spring_producer.config.KafkaTemplateConfig;
import com.ferro.mateus.kafka_w_spring_producer.producer.dto.OrderSenderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderProducer {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private KafkaTemplateConfig kafkaTemplateConfig;

    public void sendOrder(OrderSenderDTO order) throws JsonProcessingException {
        kafkaTemplateConfig.kafkaTemplate().send("order",
                objectMapper.writeValueAsString(order));
    }
}
