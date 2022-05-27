package com.example.order.service;

import java.util.List;
import java.util.Optional;

import com.example.order.entities.Order;

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

	public Optional<Order> findById(Integer id);

	public Order saveOrder(Order order);
}
