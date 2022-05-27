package com.order.microservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.order.microservice.entities.Orders;

@Repository
public interface OrderRepository extends CrudRepository<Orders, Integer> {

}
