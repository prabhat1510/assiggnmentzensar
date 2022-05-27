package com.order.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.order.entity.Order;
import com.order.service.OrderService;



public class OrderController {
	@Autowired
	OrderService orderService;

	
	@RequestMapping(value = "/addorder", method = RequestMethod.POST)
	public ModelAndView addOrder(@RequestBody Order order) {

		String message = orderService.addOrder(order);
		Map<String, String> model = new HashMap<String, String>();
		model.put("message", message);
		ModelAndView modelAndView = new ModelAndView("success", model);
		return modelAndView;
	}
	@RequestMapping(value="/getallOrders", method = RequestMethod.GET)
	public ModelAndView getAllOrders() {
		List<Order> orders = orderService.getAllOrders();
		
		Map<String, List<Order>> model = new HashMap<String, List<Order>>();
		model.put("allOrders", orders);
		
		ModelAndView modelAndView = new ModelAndView("orderinfo", model);
		return modelAndView;
		
	}
	@GetMapping("/getorder/{id}")
	public ModelAndView getOrderById(@PathVariable Integer id)
	{
		Order ord = orderService.getOrderById(id);
		Map<String, Order> model = new HashMap<String, Order>();
		model.put("order", ord);
		
		ModelAndView modelAndView = new ModelAndView("orderdetail", model);
		return modelAndView;
	}
}
