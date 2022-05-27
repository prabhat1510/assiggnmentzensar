package com.customer.microservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.microservice.entities.Customer;
import com.customer.microservice.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository repository;

	@Override
	public List<Customer> getAllCustomers() {
		return (List<Customer>) repository.findAll();
	}

	@Override
	public Customer addCustomer(Customer customer) {
		return repository.save(customer);
	} 

	@Override
	public Customer getCustomer(Integer id) {
		Optional<Customer> customer = repository.findById(id);
		
		if(customer.isPresent()) {
			return customer.get();
		} else {
			return null;
		}
	}

}
