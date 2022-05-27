package com.example.order.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.order.entity.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order,Integer> {

}
