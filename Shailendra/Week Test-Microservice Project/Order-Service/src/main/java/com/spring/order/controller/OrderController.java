package com.spring.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.order.model.Order;
import com.spring.order.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	private OrderService orderService;
//	@Autowired
//	private OrderCustomerConsumer feignClient;

	@GetMapping("product-feign")
	public String getProduct() {
		return "product return";

	}

	// Create
	@PostMapping("/add")
	public Order addOrder(@RequestBody Order order) {
		return orderService.addOrder(order);
	}

	// Retrieve
	@GetMapping("/{id}")
	public Order retrieveOrder(@PathVariable("id")Integer orderid) {

		return orderService.retrieveOrder(orderid);
	}

	// Delete
	@DeleteMapping("/removeorder/{id}")
	public String deleteOrder(@PathVariable("id") Integer orderid) {

		return orderService.deleteOrder(orderid);
	}

	// Update
	@PutMapping("/updateorder")
	public String updateOrder(@RequestBody Order order) {
		return orderService.updateOrder(order);
	}


	@GetMapping(value = "/all")
	public List<Order> getallOrder() {
		return orderService.getAllOrder();
	}
}
