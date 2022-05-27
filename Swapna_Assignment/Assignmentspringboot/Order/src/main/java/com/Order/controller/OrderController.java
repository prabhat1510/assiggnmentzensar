package com.Order.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.entities.Order;
import com.example.test.service.OrderService;

public class OrderController {

	@Autowired
	OrderService orderService;
	
	
	@GetMapping("/orders")
	public List<Order> allCategories() {
		List<Order> orders = orderService.allOrder();
		return orders;
	}
}

	
	


	