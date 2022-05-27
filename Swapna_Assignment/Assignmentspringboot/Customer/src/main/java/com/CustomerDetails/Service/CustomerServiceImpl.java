package com.CustomerDetails.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CustomerDetails.Repository.CustomerRepository;
import com.CustomerDetails.entities.CustomerDetails;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@Service
public  class CustomerServiceImpl  implements Customerservice {

	
	@Autowired
	CustomerRepository customerRepository;
	@Override
	public CustomerDetails addCustomerDetails(CustomerDetails customer) {

	return customerRepository.save(customer);
	}
	
	public String deleteCustomer(Integer customerId) {
	customerRepository.deleteById(customerId);
	return "User with customerId ---" + customerId + " deleted successfully";
	}
	public String updateCustomer(CustomerDetails customer) {
	Optional<CustomerDetails> cus1 = customerRepository.findById(customer.getId());
	if (cus1.isPresent()) {
	CustomerDetails cs = customerRepository.save(customer);
	if (cs != null) {
	return "Customer entity updated successfully";
	} else {
	return "Customer entity not updated successfully";
	}
	} else {
	return "User with customerId ---" + customer.getId() + " cannot be update as it doesn't exists";
	}
	}
	public List<CustomerDetails> getAllCustomers() {

	return (List<CustomerDetails>) customerRepository.findAll();
	}
}


	
		