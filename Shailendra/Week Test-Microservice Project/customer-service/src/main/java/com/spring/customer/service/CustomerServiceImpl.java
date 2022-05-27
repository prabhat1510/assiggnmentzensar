package com.spring.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.customer.model.Customer;
import com.spring.customer.repository.CustomerRepository;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	

	@Override
	public List<Customer> getAllCustomer() {
		return customerRepository.findAll();
	
		
	}


	@Override
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
}
