package com.assignment.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.demo.exceptions.NoDataFoundException;
@RestController
public class NoDataFoundExceptionHandler {
	@ExceptionHandler(NoDataFoundException.class)
	public ResponseEntity<Object> handleNoDataFoundException() {
		return new ResponseEntity<>("No data found", HttpStatus.NOT_FOUND);
	}

}