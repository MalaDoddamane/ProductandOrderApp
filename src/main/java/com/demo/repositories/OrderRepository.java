package com.demo.repositories;

import com.demo.orders.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findAllByCreationDateTimeAfterAndCreationDateTimeBefore(LocalDateTime after, LocalDateTime before);
}
