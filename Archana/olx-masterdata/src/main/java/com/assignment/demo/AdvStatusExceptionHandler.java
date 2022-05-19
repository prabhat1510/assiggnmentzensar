package com.assignment.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.assignment.demo.exceptions.NoStatusFoundException;
import com.assignment.demo.exceptions.StatusNotUpdatedException;

@RestControllerAdvice
public class AdvStatusExceptionHandler {
	@ExceptionHandler(NoStatusFoundException.class)
	public ResponseEntity<Object> handleNoStatusFoundException() {
		return new ResponseEntity<>("AdvStatus Not Found", HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(StatusNotUpdatedException.class)
	public ResponseEntity<Object> handleStatusNotUpdatedException() {
		return new ResponseEntity<>("AdvStatus Not Found", HttpStatus.NOT_FOUND);
	}

}
