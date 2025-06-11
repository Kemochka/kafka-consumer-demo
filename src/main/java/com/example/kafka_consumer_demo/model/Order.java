package com.example.kafka_consumer_demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Order(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        long orderId,
        String productName
) {

}
