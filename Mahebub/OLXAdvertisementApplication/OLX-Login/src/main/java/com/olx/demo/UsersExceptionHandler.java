package com.olx.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.olx.demo.exception.NoUsersFoundException;

@RestControllerAdvice
public class UsersExceptionHandler {
	@ExceptionHandler(NoUsersFoundException.class)
	public ResponseEntity<Object> handleNoUsersFoundException() {
		return new ResponseEntity<Object>("User not found",HttpStatus.NOT_FOUND);
	}
}
