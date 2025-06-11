package com.example.kafka_consumer_demo.service;

import com.example.kafka_consumer_demo.model.Order;

import java.util.List;
import java.util.Optional;

public interface OrderServiceInterface {
    Optional<Order> getOrderById(Long id);
    List<Order> getAllOrders();
}
