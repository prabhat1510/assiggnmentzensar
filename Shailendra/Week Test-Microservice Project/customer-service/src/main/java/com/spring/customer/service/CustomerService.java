package com.spring.customer.service;

import java.util.List;

import com.spring.customer.model.Customer;

public interface  CustomerService  {

	List<Customer> getAllCustomer();

	Customer saveCustomer(Customer customer);
	

}
