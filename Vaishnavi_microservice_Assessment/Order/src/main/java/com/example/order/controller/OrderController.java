package com.example.order.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.order.entities.Order;
import com.example.order.service.OrderService;

@RestController
@RequestMapping("/api/product")
public class OrderController  {

	private OrderService orderService;

	@GetMapping("/")
	public List<Order> getAllOrder() {
		return orderService.getAllOrder();

	}

	@GetMapping("/id")
	public Optional<Order> getOrderById(@PathVariable Integer id) {
		return orderService.findById(id);

	}

	@PostMapping("/save")
	public Order saveOrder(@RequestBody Order order) {
		return orderService.saveOrder(order);
	}

}
