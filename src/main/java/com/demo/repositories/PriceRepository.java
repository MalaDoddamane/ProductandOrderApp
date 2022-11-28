package com.demo.repositories;

import com.demo.products.Price;
import com.demo.products.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Price, Long> {
    Price findTopByProductOrderByCreationDateTime(Product product);
}

