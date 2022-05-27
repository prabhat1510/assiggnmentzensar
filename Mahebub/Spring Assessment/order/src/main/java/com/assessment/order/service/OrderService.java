package com.assessment.order.service;

import java.util.List;

import com.assessment.order.entities.Order;

public interface OrderService {
	// Create
	public Order addOrder(Order order);

	// Retrieve
	public Order retrieveOrder(Integer orderid);

	// Delete
	public String deleteOrder(Integer orderid);

	// Update
	public String updateOrder(Order order);

	// get all Orders
	public List<Order> getAllOrder();
}
