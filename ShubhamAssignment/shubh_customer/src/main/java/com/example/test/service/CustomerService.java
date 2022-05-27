package com.example.test.service;

import java.util.List;

import com.example.test.entities.Customer;

public interface CustomerService {
	public List<Customer> allCustomer(); 
	public Customer addCustomer(Customer customers);

}
