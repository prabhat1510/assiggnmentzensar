package com.assessment.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.customer.entities.Customer;
import com.assessment.customer.service.*;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerservice;
	
	// Create
		@PostMapping("/addcustomer")
		public Customer addCustomer(@RequestBody Customer customer) {
			return customerservice.addCustomer(customer);
		}

		// Receiving data 
		@RequestMapping(value = "/allcustomers", method = RequestMethod.GET, produces = { MediaType.APPLICATION_XML_VALUE })
		public List<Customer> getCustomers() {
			return customerservice.getAllCustomers();
		}

}
