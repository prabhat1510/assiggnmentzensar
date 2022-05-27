package com.assessment.order.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assessment.order.entities.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {

}
