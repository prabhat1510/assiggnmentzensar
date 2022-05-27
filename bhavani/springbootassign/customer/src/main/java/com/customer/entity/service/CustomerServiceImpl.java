package com.customer.entity.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.entity.Customer;
import com.customer.entity.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer addCustomers(Customer customer) {

		return customerRepository.save(customer);
	}

	@Override
	public Customer retrieveCustomer(Integer customerId) {
		Optional<Customer> cus = customerRepository.findById(customerId);
		if (cus.isPresent()) {
			return cus.get();
		} else {
			return null;
		}

	}
	@Override
	public String deleteCustomer(Integer customerId) {
		customerRepository.deleteById(customerId);
		return "User with customerId ---" + customerId + "  deleted successfully";
	}
	@Override
	public String updateCustomer(Customer customer) {
		Optional<Customer> cus1 = customerRepository.findById(customer.getId());
		if (cus1.isPresent()) {
			Customer cs = customerRepository.save(customer);
			if (cs != null) {
				return "Customer entity updated successfully";
			} else {
				return "Customer entity not updated successfully";
			}
		} else {
			return "User with customerId ---" + customer.getId() + "  cannot be update as it doesn't exists";
		}
	}
	@Override
	public List<Customer> getAllCustomers() {
		
		return (List<Customer>) customerRepository.findAll();
}


}
