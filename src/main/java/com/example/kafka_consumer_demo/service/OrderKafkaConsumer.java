package com.example.kafka_consumer_demo.service;

import com.example.kafka_consumer_demo.model.Order;
import com.example.kafka_consumer_demo.repository.OrderRepository;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderKafkaConsumer {
    private static final Logger log = LoggerFactory.getLogger(OrderKafkaConsumer.class);
    private final OrderRepository orderRepository;

    public OrderKafkaConsumer(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @KafkaListener(topics = "orders")
    public void consumeOrder(ConsumerRecord<String, String> record) {
        log.info(
                "Consumed order: {}, key={}, partition={}, order={}",
                record.value(),
                record.key(),
                record.partition(), orderRepository.findAll().size()
        );
    }
}
