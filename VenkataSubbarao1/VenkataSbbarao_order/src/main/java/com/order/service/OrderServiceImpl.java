package com.order.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.entity.Customer;
import com.order.entity.Order;
import com.order.entity.Product;
import com.order.repository.CustomerRepository;
import com.order.repository.OrderRepository;
import com.order.repository.ProductRepository;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	OrderRepository repository;
	
	@Autowired
	CustomerRepository cus_repository;
	
	@Autowired
	ProductRepository pro_repository;


	@Override
	public List<Order> getAllOrders() {
		return (List<Order>) repository.findAll();
	}
	public String addOrder(Order order) {
		Order ord = repository.save(order);

		if(ord != null) {
			return "Order with id --"+ord.getOrderid()+" added successfully";
		}else {
			return "Unable to add order";
		}
	}
	public Order getOrderById(Integer id) {
		Optional<Order> ord = repository.findById(id);
		if(ord.isPresent()) {
			return ord.get();
		} else {
			return null;
		}
	}
	public Customer getCustomerById(Integer id) {
		Optional<Customer> customer = cus_repository.findById(id);
		if(customer.isPresent()) {
			return customer.get();
		} else {
			return null;
		}
	}
	public Product getProductById(Integer id) {
		Optional<Product> product = pro_repository.findById(id);
		if(product.isPresent()) {
			return product.get();
		} else {
			return null;
		}
	}
}
