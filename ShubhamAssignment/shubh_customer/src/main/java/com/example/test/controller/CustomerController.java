package com.example.test.controller;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.entities.Customer;
import com.example.test.service.CustomerService;

@RestController
public class CustomerController {
	

	@Autowired
	CustomerService customerService;
	
	@PostMapping("/customer")
	public Customer addCustomer(@RequestBody Customer customers) {
		return customerService.addCustomer(customers);
	}
	
	@GetMapping("/customer")
	public List<Customer> allcustomers() {
		List<Customer> customers = customerService.allCustomer();
		
		return customers;
	}

}
