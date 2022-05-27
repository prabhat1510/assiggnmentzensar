package com.assignment.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.assignment.demo.exceptions.CategorieNotUpdate;
import com.assignment.demo.exceptions.NoCategoriesFoundException;

@RestControllerAdvice
public class CategoriesExceptionHandler {
	@ExceptionHandler(NoCategoriesFoundException.class)
	public ResponseEntity<Object> handleNoCategoriesFoundException(){
		return new ResponseEntity<>("Categories Not Found",HttpStatus.NOT_FOUND);
	}
	
	
		@ExceptionHandler(CategorieNotUpdate.class)
		public ResponseEntity<Object> handleCategorieNotUpdate(){
			return new ResponseEntity<>("Categories Not Found",HttpStatus.NOT_FOUND);
		}

}
