package com.example.kafka_consumer_demo.repository;

import com.example.kafka_consumer_demo.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
}
