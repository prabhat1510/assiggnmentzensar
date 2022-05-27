package com.example.order.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.order.entities.Order;

public interface OrderRepository extends CrudRepository<Order,Integer> {

}