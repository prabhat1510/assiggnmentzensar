package com.example.order.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.order.entity.Order;
import com.example.order.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	OrderRepository orderRepository;

	public Order addOrder(Order order) {
		return orderRepository.save(order);
	}

	public Order retrieveOrder(Integer orderId) {
		Optional<Order> order = orderRepository.findById(orderId);
		if (order.isPresent()) {
			return order.get();
		} else {
			return null;
		}
	}

	public String deleteOrder(Integer orderId) {
		orderRepository.deleteById(orderId);
		return "order with orderId ---" +orderId + "  deleted successfully";
	}

	public String updateOrder(Order order) {
		Optional<Order> bok = orderRepository.findById(order.getOrderId());
		if (bok.isPresent()) {
			Order bk = orderRepository.save(order);
			if (bk != null) {
				return "Order entity updated successfully";
			} else {
				return "Order entity not updated successfully";
			}
		} else {
			return "Order with OrderId ---" + order.getOrderId() + "  cannot be update as it doesn't exists";
		}
	}

	@Override
	public List<Order> getAllOrders() {
		return (List<Order>) orderRepository.findAll();
	}

}
