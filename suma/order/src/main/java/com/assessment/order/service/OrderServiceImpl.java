package com.assessment.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assessment.order.entities.*;
import com.assessment.order.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository orderrepo;

	@Override
	public Order addOrder(Order order) {
		return orderrepo.save(order);
	}

	@Override
	public List<Order> getAllOrders() {
		return (List<Order>) orderrepo.findAll();
	}

}

