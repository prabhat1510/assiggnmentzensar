package com.spring.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "Order-Service",configuration = OrderService.class)
public interface OrderCustomerConsumer {
	@GetMapping("/getProduct")
	public String getProduct();
	

}
