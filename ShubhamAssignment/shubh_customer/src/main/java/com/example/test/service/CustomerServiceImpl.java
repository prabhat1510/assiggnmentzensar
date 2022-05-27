package com.example.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.entities.Customer;
import com.example.test.repository.CustomerRepository;
import com.example.test.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository repository;

	@Override
	public Customer addCustomer(Customer customers) {
		return repository.save(customers);
	}

	@Override
	public List<Customer> allCustomer() {
		return (List<Customer>) repository.findAll();
	}
}
