package com.employee.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.employee.demo.exceptions.NoEmployeeFoundException;

@RestControllerAdvice
public class EmployeeExceptionHandler {
	
	@ExceptionHandler(NoEmployeeFoundException.class)
	public ResponseEntity<Object> handleNoEmployeeFoundException() {
		return new ResponseEntity<>("Employee not found", HttpStatus.NOT_FOUND);
	}
	
	

}
