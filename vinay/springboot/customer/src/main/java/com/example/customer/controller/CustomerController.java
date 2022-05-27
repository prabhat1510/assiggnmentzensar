package com.example.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer.entites.Customer;
import com.example.customer.service.CustomerService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping(value="/api/v1/customer")
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/addcustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);
	}
	@GetMapping("/{customerId}")
	public Customer retrieveCustomer(@PathVariable Integer customerId) {
		
		return customerService.retrieveCustomer(customerId);
	}
	@DeleteMapping("/removecustomer/{customerId}")
	public String deleteCustomer(@PathVariable Integer customerId) {
		
		return customerService.deleteCustomer(customerId);
	}
	@PutMapping("/updatecustomer")
	public String updateCustomer(@RequestBody Customer customer) {
		return customerService.updateCustomer(customer);
	}
}
