package com.example.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customer.entities.Customer;
import com.example.customer.exception.CustomerNotUpdated;
import com.example.customer.exception.NoCustomerFound;
import com.example.customer.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);	
	}

	@Override
	public Customer getCustomer(Integer customerId) throws NoCustomerFound {
		Optional<Customer> customer =customerRepository.findById(customerId);
		if(customer.isPresent())
		{
			return customer.get();
		}
		else
		{
			throw new NoCustomerFound();
		}
	}

	@Override
	public String updateCostumer(Customer customer) throws CustomerNotUpdated {
		Optional<Customer> cust =customerRepository.findById( customer.getCustomerId());
		if(cust.isPresent())
		{
			Customer c=customerRepository.save(customer);
			if(c!=null)
			{
				return "customer updated successfully";
			}
			else
			{
				return "Error while updating customer";
			}
		}
		else
		{
			throw new CustomerNotUpdated();
		}
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

}
