package com.Order.Repository;

import org.springframework.data.repository.CrudRepository;

import com.Order.entities.Order;

public interface OrderRepository  extends CrudRepository<Order, Integer> {

}


