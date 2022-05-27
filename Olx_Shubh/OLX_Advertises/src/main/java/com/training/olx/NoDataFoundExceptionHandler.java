package com.training.olx;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.training.olx.exceptions.NoDataFoundException;

@RestControllerAdvice
public class NoDataFoundExceptionHandler {

	@ExceptionHandler(NoDataFoundException.class)
	public ResponseEntity<Object> handleNoDataFoundException() {
		return new ResponseEntity<>("No data found", HttpStatus.NOT_FOUND);
	}
}
