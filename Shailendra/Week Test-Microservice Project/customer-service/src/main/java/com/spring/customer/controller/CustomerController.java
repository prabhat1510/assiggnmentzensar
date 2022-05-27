package com.spring.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.customer.model.Customer;
import com.spring.customer.service.CustomerService;
@RestController
@RequestMapping("/api/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("/all")
	public List<Customer> getAllCustomer()
	{
		return customerService.getAllCustomer();
		
	}
	@PostMapping("/save")
	public Customer saveCustomer(@RequestBody Customer customer)
	{
		return customerService.saveCustomer(customer);
	}
	


}
