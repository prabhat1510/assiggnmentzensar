package com.example.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.order.entity.Order;
import com.example.order.service.OrderService;

@RestController
@RequestMapping(value="/api/v1/order")
public class OrderController {
	@Autowired
	OrderService orderService;
	@PostMapping("/addorder")
	public Order addOrder(@RequestBody Order order) {
		return orderService.addOrder(order);
	}

	@GetMapping("/{orderId}")
	public Order retrieveOrder(@PathVariable Integer orderId) {
		
		return orderService.retrieveOrder(orderId);
	}
	@DeleteMapping("/removeorder/{orderId}")
	public String deleteOrder(@PathVariable Integer orderId) {
		
		return orderService.deleteOrder(orderId);
	}
	
	//Update
	@PutMapping("/updateorder")
	public String updateOrder(@RequestBody Order order) {
		return orderService.updateOrder(order);
	}


 	}

