package com.order.microservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.microservice.entities.Orders;
import com.order.microservice.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository repository;
	
	@Override
	public List<Orders> getAllProducts() {
		return (List<Orders>) repository.findAll();
	}

	@Override
	public Orders addProduct(Orders orders) {
		return repository.save(orders);
	}

	@Override
	public Orders getProductId(Integer id) {
		Optional<Orders> order = repository.findById(id);
		
		if(order.isPresent()) {
			return order.get();
		} else {
			return null;
		}
	}

}
