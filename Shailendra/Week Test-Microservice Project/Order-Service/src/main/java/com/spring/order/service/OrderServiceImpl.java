package com.spring.order.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.order.model.Order;
import com.spring.order.repository.OrderRepositroy;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderRepositroy orderRepositroy;

	@Override
	public Order addOrder(Order order) {

		return orderRepositroy.save(order);
	}

	@Override
	public Order retrieveOrder(Integer orderid) {
		Optional<Order> order = orderRepositroy.findById(orderid);
		return order.get();
	}

	@Override
	public String deleteOrder(Integer orderid) {
		if (orderid != null) {
			orderRepositroy.deleteById(orderid);
			return "Order with orderid ---" + orderid + "  deleted successfully";
		} else {
			return "Unable to detele Order with orderid " + orderid;
		}
	}

	@Override
	public String updateOrder(Order order) {
		Optional<Order> odr = orderRepositroy.findById(order.getCustomerid());
		if (odr.isPresent()) {
			Order o = orderRepositroy.save(order);
			if (o != null) {
				return "Order entity updated successfully";
			} else {
				return "Order entity not updated successfully";
			}
		} else {
			return "Order with orderid ---" + order.getCustomerid() + "  cannot be update as it doesn't exists";
		}

	}

	@Override
	public List<Order> getAllOrder() {
		return (List<Order>) orderRepositroy.findAll();
	}

}
