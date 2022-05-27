package com.example.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer.entites.Customer;
import com.example.customer.service.CustomerService;

@RestController
public class CustomersController {
	


		@Autowired
	CustomerService customerService;
			
		//Receiving data from client
		@RequestMapping(value="/api/v2/customer/allcustomers", 
					method=RequestMethod.GET,
					consumes= {MediaType.APPLICATION_XML_VALUE},
					produces={MediaType.APPLICATION_XML_VALUE})
			public List<Customer> getBooks(){
				return customerService.getAllCustomer();
			}
	}

