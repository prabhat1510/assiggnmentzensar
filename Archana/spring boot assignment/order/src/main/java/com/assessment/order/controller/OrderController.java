package com.assessment.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.order.entities.Order;
import com.assessment.order.service.OrderService;

@RestController
@RequestMapping(value = "/order")
public class OrderController {
	@Autowired
	OrderService orderService;

	// Create
	@PostMapping("/addorder")
	public Order addOrder(@RequestBody Order order) {
		return orderService.addOrder(order);
	}

	// Retrieve
	@GetMapping("/{orderid}")
	public Order retrieveOrder(@PathVariable Integer orderid) {

		return orderService.retrieveOrder(orderid);
	}

	// Delete
	@DeleteMapping("/removeorder/{orderid}")
	public String deleteOrder(@PathVariable Integer orderid) {

		return orderService.deleteOrder(orderid);
	}

	// Update
	@PutMapping("/updateorder")
	public String updateOrder(@RequestBody Order order) {
		return orderService.updateOrder(order);
	}

	// Returns all Order details
	@RequestMapping(value = "/details", method = RequestMethod.GET, produces = { MediaType.APPLICATION_XML_VALUE })
	public List<Order> getOrder() {
		return orderService.getAllOrder();
	}
}
