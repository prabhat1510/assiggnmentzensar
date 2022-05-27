package com.assignment.demo.service;

import java.util.List;

import com.assignment.demo.entites.Customer;

public interface CustomerService {
	// Create
	public Customer addCustomer(Customer customer);

	// Retrieve
	public Customer retrieveCustomer(Integer customerId);

	// Delete
	public String deleteCustomer(Integer customerId);

	// Retrieve all books
	public List<Customer> getAllCustomers();
}
