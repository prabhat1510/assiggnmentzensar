package com.example.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.entities.Order;
import com.example.test.repository.OrderRepository;

public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository repository;

	@Override
	public List<Order> allOrder() {
		return (List<Order>) repository.findAll();
	}

}
