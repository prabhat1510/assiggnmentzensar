package com.order.microservice.service;

import java.util.List;

import com.order.microservice.entities.Orders;

public interface OrderService {
	
	public List<Orders> getAllProducts();
	public Orders addProduct(Orders orders);
	public Orders getProductId(Integer id);

}
