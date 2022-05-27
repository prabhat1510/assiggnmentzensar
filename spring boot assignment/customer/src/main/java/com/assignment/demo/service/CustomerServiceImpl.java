package com.assignment.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.demo.entites.Customer;
import com.assignment.demo.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer retrieveCustomer(Integer customerId) {
		Optional<Customer> customer = customerRepository.findById(customerId);
		if (customer.isPresent()) {
			return customer.get();
		} else {
			return null;
		}
	}

	@Override
	public String deleteCustomer(Integer customerId) {
		customerRepository.deleteById(customerId);
		return "Customer with customerId ---" + customerId + "  deleted successfully";
	}

	@Override
	public List<Customer> getAllCustomers() {
		return (List<Customer>) customerRepository.findAll();
	}

}
