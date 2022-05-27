package com.customer.entity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.entity.Customer;
import com.customer.entity.service.CustomerService;


@RestController
@RequestMapping(value="/api/v2/customer")
public class CustomerController {

		@Autowired
		CustomerService customerService;
		
		//Create
		@PostMapping("/addcustomer")
		public Customer addCustomer(@RequestBody Customer customer) {
			return customerService.addCustomers(customer);
		}
		
		//Delete
		@DeleteMapping("/removecustomer/{customerId}")
		public String deleteCustomer(@PathVariable Integer customerId) {
			
			return customerService.deleteCustomer(customerId);
		}
		
		//Update
		@PutMapping("/updatecustomer")
		public String updateCustomer(@RequestBody Customer customer) {
			return customerService.updateCustomer(customer);
		}
		
	}




