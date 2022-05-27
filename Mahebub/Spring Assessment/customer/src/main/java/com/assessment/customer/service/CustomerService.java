package com.assessment.customer.service;

import java.util.List;

import com.assessment.customer.entities.Customer;

public interface CustomerService {
	// Create
	public Customer addCustomer(Customer customer);

	// Retrieve
	public Customer retrieveCustomer(Integer customerid);
	// Delete
	public String deleteCustomer(Integer customerid);

	// Update
	public String updateCustomer(Customer customer);

	// get all Customers
	public List<Customer> getAllCustomer();
}
