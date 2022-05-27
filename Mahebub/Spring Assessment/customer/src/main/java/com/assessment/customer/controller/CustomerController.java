package com.assessment.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.customer.entities.Customer;
import com.assessment.customer.service.CustomerService;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
	@Autowired
	CustomerService customerService;

	// Create
	@PostMapping("/addcustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);
	}

	// Retrieve
	@GetMapping("/{customerid}")
	public Customer retrieveCustomer(@PathVariable Integer customerid) {

		return customerService.retrieveCustomer(customerid);
	}

	// Delete
	@DeleteMapping("/removecustomer/{customerid}")
	public String deleteCustomer(@PathVariable Integer customerid) {

		return customerService.deleteCustomer(customerid);
	}

	// Update
	@PutMapping("/updatecustomer")
	public String updateCustomer(@RequestBody Customer customer) {
		return customerService.updateCustomer(customer);
	}

	// Returns all Customer details
	@RequestMapping(value = "/details", method = RequestMethod.GET, produces = { MediaType.APPLICATION_XML_VALUE })
	public List<Customer> getCustomer() {
		return customerService.getAllCustomer();
	}
}
