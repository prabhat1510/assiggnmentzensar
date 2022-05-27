package com.example.customer.service;

import java.util.List;

import com.example.customer.entities.Customer;
import com.example.customer.exception.CustomerNotUpdated;
import com.example.customer.exception.NoCustomerFound;

public interface CustomerService {
	
	public Customer addCustomer(Customer customer);
	
	public Customer getCustomer(Integer customerId) throws NoCustomerFound;
	
	public String updateCostumer(Customer customer) throws CustomerNotUpdated;
	
	public List<Customer> getAllCustomers();

}
