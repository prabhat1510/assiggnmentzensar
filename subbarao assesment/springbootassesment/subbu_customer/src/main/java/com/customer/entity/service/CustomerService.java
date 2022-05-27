package com.customer.entity.service;

import java.util.List;

import com.customer.entity.Customer;



public interface CustomerService {
	public Customer addCustomers(Customer customer);
	//Retrieve
	public Customer retrieveCustomer(Integer customerId);
	//Delete
	public String deleteCustomer(Integer customerId);
	
	//Update
	public String updateCustomer(Customer customer);
	//Retrieve all customers
	public List<Customer> getAllCustomers();
}

