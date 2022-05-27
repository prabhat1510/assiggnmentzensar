package com.assessment.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.order.entities.Order;
import com.assessment.order.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	OrderService orderservice;

	// Create
	@PostMapping("/addorder")
	public Order addOrder(@RequestBody Order order) {
		return orderservice.addOrder(order);
	}

	// Receiving data from client
	@RequestMapping(value = "/allorders", method = RequestMethod.GET, produces = { MediaType.APPLICATION_XML_VALUE })
	public List<Order> getOrders() {
		return orderservice.getAllOrders();
	}
}
