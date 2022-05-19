package com.olx.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.olx.demo.exception.NoAdvertisesFoundException;

@RestControllerAdvice
public class AdvertisesExceptionHandler {
	@ExceptionHandler(NoAdvertisesFoundException.class)
	public ResponseEntity<Object> handleNoAdvertisesFoundException() {
		return new ResponseEntity<Object>("Advertises not found",HttpStatus.NOT_FOUND);
	}
}
