package com.ferro.mateus.kafka_w_spring_consumer.service.impl;

import com.ferro.mateus.kafka_w_spring_consumer.consumer.dto.OrderEvent;
import com.ferro.mateus.kafka_w_spring_consumer.domain.entity.OrderInfo;
import com.ferro.mateus.kafka_w_spring_consumer.domain.repository.OrderInfoRepository;
import com.ferro.mateus.kafka_w_spring_consumer.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderInfoServiceImpl implements OrderInfoService {

    @Autowired
    private OrderInfoRepository orderInfoRepository;

    @Override
    public void saveInfo(OrderEvent message) {
        OrderInfo orderInfo = OrderInfo.builder()
                .orderId(message.id())
                .orderRegion(message.region())
                .orderTotal(message.total())
                .orderDate(message.date())
                .build();
        orderInfoRepository.save(orderInfo);
    }
}
