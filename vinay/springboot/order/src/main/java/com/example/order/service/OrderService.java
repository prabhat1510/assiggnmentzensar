package com.example.order.service;

import java.util.List;

import com.example.order.entity.Order;

public interface OrderService {
	//Create
		public Order addOrder(Order order);
		//Retrieve
		public Order retrieveOrder(Integer orderId);
		//Delete
		public String deleteOrder(Integer orderId);
		
		//Update
		public String updateOrder(Order order);
		
		//Retrieve all books
		public List<Order> getAllOrders();
}
