package com.example.customer.service;

import java.util.List;

import com.example.customer.entites.Customer;

public interface CustomerService {
	public Customer addCustomer(Customer customer);
	//Retrieve
	public Customer retrieveCustomer(Integer customerId);
	//Delete
	public String deleteCustomer(Integer customerId);
	
	//Update
	public String updateCustomer(Customer customer);
	
	//Retrieve all books
	public List<Customer> getAllCustomer();
}
