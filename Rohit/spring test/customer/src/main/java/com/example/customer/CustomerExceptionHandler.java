package com.example.customer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.customer.exception.CustomerNotUpdated;
import com.example.customer.exception.NoCustomerFound;

public class CustomerExceptionHandler {
	@ExceptionHandler(NoCustomerFound.class)
	public ResponseEntity<Object> exception(NoCustomerFound exception)
	{
		return new ResponseEntity<>("Customer not Found",HttpStatus.NOT_FOUND);
	} 
	
	@ExceptionHandler(CustomerNotUpdated.class)
	public ResponseEntity<Object> exception(CustomerNotUpdated exception)
	{
		return new ResponseEntity<>("Customer not updated",HttpStatus.NOT_FOUND);
	} 

}
