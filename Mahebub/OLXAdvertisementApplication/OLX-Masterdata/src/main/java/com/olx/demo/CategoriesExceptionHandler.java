package com.olx.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.olx.demo.exception.NoCATEGORIESFoundException;

@RestControllerAdvice
public class CategoriesExceptionHandler {
	@ExceptionHandler(NoCATEGORIESFoundException.class)
	public ResponseEntity<Object> handleNoCATEGORIESFoundException() {
		return new ResponseEntity<Object>("CATEGORIES not found",HttpStatus.NOT_FOUND);
	}
}
