package com.example.order.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.order.entities.Order;
import com.example.order.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	OrderRepository orderRepository;

	@Override
	public Order addOrder(Order order) {

		return orderRepository.save(order);
	}
	
	@Override
	public Order retrieveOrder(Integer orderid) {
		Optional<Order> order = orderRepository.findById(orderid);
		return order.get();
	}

	@Override
	public String deleteOrder(Integer orderid) {
		if(orderid != null) {
			orderRepository.deleteById(orderid);
			return "Order with orderid ---" + orderid + "  deleted successfully";
		}
		else {
			return "Unable to detele Order with orderid "+orderid;
		}
	}

	@Override
	public String updateOrder(Order order) {
		Optional<Order> odr = orderRepository.findById(order.getOrderid());
		if (odr.isPresent()) {
			Order o = orderRepository.save(order);
			if (o != null) {
				return "Order entity updated successfully";
			} else {
				return "Order entity not updated successfully";
			}
		} else {
			return "Order with orderid ---" + order.getOrderid() + "  cannot be update as it doesn't exists";
		}

	}

	@Override
	public List<Order> getAllOrder() {
		return (List<Order>) orderRepository.findAll();
	}

	@Override
	public Optional<Order> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order saveOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}
}