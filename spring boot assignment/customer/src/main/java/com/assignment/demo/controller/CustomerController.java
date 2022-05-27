package com.assignment.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.demo.entites.Customer;
import com.assignment.demo.service.CustomerService;

@RestController
@RequestMapping(value="/api/v1/customer")

public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	//Create
	@PostMapping("/addcustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);
	}
	//Retrieve
	@GetMapping("/{customerId}")
	public Customer retrieveCustomer(@PathVariable Integer customerId) {
		
		return customerService.retrieveCustomer(customerId);
	}
	//Delete
	@DeleteMapping("/removebook/{customerId}")
	public String deleteCustomer(@PathVariable Integer customerId) {
		
		return customerService.deleteCustomer(customerId);
	}
	
	/** //Update
	@PutMapping("/updatebook")
	public String updateBoook(@RequestBody Book book) {
		return bookService.updateBoook(book);
	}
	**/
	@GetMapping("/allcustomers")
	public List<Customer> getCustomers(){
		return customerService.getAllCustomers();
	}
}
