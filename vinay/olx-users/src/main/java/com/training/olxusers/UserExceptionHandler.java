package com.training.olxusers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.training.olxusers.exception.NoUserFoundException;

public class UserExceptionHandler {
	@ExceptionHandler(NoUserFoundException.class)
	public ResponseEntity<Object> exception(NoUserFoundException exception)
	{
		return new ResponseEntity<>("User not Found",HttpStatus.NOT_FOUND);
	}
}
