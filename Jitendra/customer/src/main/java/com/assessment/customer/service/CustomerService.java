package com.assessment.customer.service;

import java.util.List;

import com.assessment.customer.entities.Customer;

public interface CustomerService {

	// Create
	public Customer addCustomer(Customer customer);

	// Retrieve all users
	public List<Customer> getAllCustomers();
}
