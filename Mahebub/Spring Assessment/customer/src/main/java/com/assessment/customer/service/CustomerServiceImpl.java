package com.assessment.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assessment.customer.entities.Customer;
import com.assessment.customer.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer addCustomer(Customer customer) {

		return customerRepository.save(customer);
	}
	
	@Override
	public Customer retrieveCustomer(Integer customerid) {
		Optional<Customer> customer = customerRepository.findById(customerid);
		return customer.get();
	}

	@Override
	public String deleteCustomer(Integer customerid) {
		if(customerid != null) {
			customerRepository.deleteById(customerid);
			return "Customer with customerid ---" + customerid + "  deleted successfully";
		}
		else {
			return "Unable to detele Customer with customerid "+customerid;
		}
	}

	@Override
	public String updateCustomer(Customer customer) {
		Optional<Customer> csr = customerRepository.findById(customer.getCustomerid());
		if (csr.isPresent()) {
			Customer c = customerRepository.save(customer);
			if (c != null) {
				return "Customer entity updated successfully";
			} else {
				return "Customer entity not updated successfully";
			}
		} else {
			return "Customer with customerid ---" + customer.getCustomerid() + "  cannot be update as it doesn't exists";
		}

	}


	@Override
	public List<Customer> getAllCustomer() {
		return (List<Customer>) customerRepository.findAll();
	}
}
