package com.spring.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.order.model.Order;

@Repository
public interface OrderRepositroy extends JpaRepository<Order, Integer> {

}
