package com.example.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.order.entity.Order;
import com.example.order.service.OrderService;

@RestController
public class OrdersController {
	@Autowired
	OrderService orderService;
		
	//Receiving data from client
	@RequestMapping(value="/api/v2/book/allorders", 
				method=RequestMethod.GET,
				consumes= {MediaType.APPLICATION_XML_VALUE},
				produces={MediaType.APPLICATION_XML_VALUE})
		public List<Order> getOrderss(){
			return orderService.getAllOrders();
		}
}
