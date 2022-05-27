package com.example.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer.entities.Customer;
import com.example.customer.exception.CustomerNotUpdated;
import com.example.customer.exception.NoCustomerFound;
import com.example.customer.service.CustomerService;

@RestController
@RequestMapping("/api/v1/customer")

public class CustomerController {
	@Autowired
	CustomerService service;

	
	
	@PostMapping("/addcustomer")
	public Customer addCustomer(Customer customer) {
		return service.addCustomer(customer);
	}

	@GetMapping("/{cId}")
	public Customer getCustomer(Integer cId) throws NoCustomerFound {
		return service.getCustomer(cId);
	}

	@PutMapping("/updatecustomer")
	public String updateCostumer(Customer customer) throws CustomerNotUpdated {
		return service.updateCostumer(customer);
	}

	//http://localhost:9090/api/v1/customer/allcustomers
	@GetMapping("allcustomers")
	public List<Customer> getAllCustomers() {
		return service.getAllCustomers();
	}



}
