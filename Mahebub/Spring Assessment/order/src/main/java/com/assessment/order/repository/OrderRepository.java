package com.assessment.order.repository;

import org.springframework.data.repository.CrudRepository;

import com.assessment.order.entities.Order;

public interface OrderRepository extends CrudRepository<Order,Integer> {

}
