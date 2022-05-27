package com.assessment.order.service;

import java.util.List;

import com.assessment.order.entities.Order;


public interface OrderService {

	// Create
	public Order addOrder(Order order);

	// Retrieve all orders
	public List<Order> getAllOrders();

}