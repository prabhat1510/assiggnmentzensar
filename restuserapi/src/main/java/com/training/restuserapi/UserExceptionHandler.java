package com.training.restuserapi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.training.restuserapi.exception.NoUserFoundException;

@ControllerAdvice
public class UserExceptionHandler {
	@ExceptionHandler(NoUserFoundException.class)
	public ResponseEntity<Object> exception(NoUserFoundException exception)
	{
		return new ResponseEntity<>("User not Found",HttpStatus.NOT_FOUND);
	} 

}
