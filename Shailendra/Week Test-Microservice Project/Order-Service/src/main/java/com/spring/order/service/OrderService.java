package com.spring.order.service;

import java.util.List;

import com.spring.order.model.Order;

public interface OrderService {


	// Create
	 Order addOrder(Order order);

	// Retrieve
	 Order retrieveOrder(Integer orderid);

	// Delete
	 String deleteOrder(Integer orderid);

	// Update
	 String updateOrder(Order order);

	// get all Orders
	 List<Order> getAllOrder();

}
