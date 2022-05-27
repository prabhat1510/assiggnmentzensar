package com.order.service;

import java.util.List;

import com.order.entity.Customer;
import com.order.entity.Order;
import com.order.entity.Product;


public interface OrderService {
	public List<Order> getAllOrders();
	public String addOrder(Order order);
	public Order getOrderById(Integer id);
	public Customer getCustomerById(Integer id);
	public Product getProductById(Integer id);


}
