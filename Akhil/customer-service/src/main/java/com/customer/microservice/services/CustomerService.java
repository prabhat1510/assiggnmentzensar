package com.customer.microservice.services;

import java.util.List;

import com.customer.microservice.entities.Customer;



public interface CustomerService {
	
	public List<Customer> getAllCustomers();
	public Customer addCustomer(Customer customer);
	public Customer getCustomer(Integer id);

}
