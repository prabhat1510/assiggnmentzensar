package com.order.repository;

import org.springframework.data.repository.CrudRepository;

import com.order.entity.Order;





public interface OrderRepository extends CrudRepository<Order, Integer>{

}
