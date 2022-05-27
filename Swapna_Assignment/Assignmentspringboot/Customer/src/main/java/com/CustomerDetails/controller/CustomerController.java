package com.CustomerDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CustomerDetails.Service.Customerservice;
import com.CustomerDetails.entities.CustomerDetails;

@RestController
@RequestMapping(value="/api/v2/customer")
public class CustomerController{
@Autowired
	Customerservice  customerservice;
	@PostMapping("/addcustomer")
	public CustomerDetails addCustomer(@RequestBody CustomerDetails customer) {
		return ((CustomerController) customerservice).addCustomer(customer);
	}
	
	@DeleteMapping("/removecustomer/{customerid}")
	public String deletecustomer(@PathVariable Integer  customerid) {
		return customerservice.deleteCustomer( customerid);
	}
	
	@GetMapping("/updatecustomer")
	public String updatecustomer(@PathVariable Integer  customerid) {
		return customerservice.updateCustomer( customerid);
	}
	


}







	


