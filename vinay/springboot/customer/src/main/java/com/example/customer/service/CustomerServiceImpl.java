package com.example.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customer.entites.Customer;
import com.example.customer.repository.CustomerRepository;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerRepository customerRepository;
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	public Customer retrieveCustomer(Integer customerId) {
		Optional<Customer> customer = customerRepository.findById(customerId);
		if (customer.isPresent()) {
			return customer.get();
		} else {
			return null;
		}

	}

	public String deleteCustomer(Integer customerId) {
		customerRepository.deleteById(customerId);
		return "customer with customerId ---" + customerId + "  deleted successfully";
	}

	public String updateCustomer(Customer customer) {
		Optional<Customer> cus = customerRepository.findById(customer.getCostomerId());
		if (cus.isPresent()) {
			Customer cu = customerRepository.save(customer);
			if (cu != null) {
				return "customer entity updated successfully";
			} else {
				return "customer entity not updated successfully";
			}
		} else {
			return "customer with customerId ---" + customer.getCostomerId() + "  cannot be update as it doesn't exists";
		}

	}

	public List<Customer> getAllCustomer() {
		return (List<Customer>) customerRepository.findAll();
	}

}
