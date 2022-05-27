package com.CustomerDetails.Service;

import java.util.List;

import com.CustomerDetails.entities.CustomerDetails;

public interface Customerservice {
	
	public CustomerDetails addCustomerDetails(CustomerDetails  customer);
	//delete
	public CustomerDetails getCustomerDetails(Integer customerid); 
	
	//update
	public String updateCustomerDetails(Integer id, CustomerDetails  customer); 

	public static final List<CustomerDetails> getAllCustomerDetails = null;
	
}


