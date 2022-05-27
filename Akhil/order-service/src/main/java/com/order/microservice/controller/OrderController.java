package com.order.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.order.microservice.entities.Orders;
import com.order.microservice.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@GetMapping("/all")
	public List<Orders> getAllProducts() {
		return orderService.getAllProducts();
	}
	
	@GetMapping("/{id}")
	public Orders getProductId(@PathVariable Integer id) {
		return orderService.getProductId(id);
	}
	
	@PostMapping("/add")
	public Orders addProduct(@RequestBody Orders orders) {
		return orderService.addProduct(orders);
	}
	
	
}
