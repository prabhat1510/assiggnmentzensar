package com.training.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.training.demo.exception.NoUserFoundException;

@RestControllerAdvice
public class UserExceptionHandler {
	@ExceptionHandler(NoUserFoundException.class)
	public ResponseEntity<Object> handleNoUserFoundException() {
		return new ResponseEntity<Object>("User not found",HttpStatus.NOT_FOUND);
	}
}
