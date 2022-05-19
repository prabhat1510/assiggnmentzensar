package com.training.olxmaster;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.training.olxmaster.exception.CategorieNotUpdate;
import com.training.olxmaster.exception.NoCategoriesFoundException;
import com.training.olxmaster.exception.NoStatusFoundException;
import com.training.olxmaster.exception.StatusNotUpdatedException;

public class OlxMasterdataExceptionHandler {
	@ExceptionHandler(NoCategoriesFoundException.class)
	public ResponseEntity<Object> exception(NoCategoriesFoundException exception)
	{
		return new ResponseEntity<>("Categorie not Found",HttpStatus.NOT_FOUND);
	} 
	@ExceptionHandler(CategorieNotUpdate.class)
	public ResponseEntity<Object> exception(CategorieNotUpdate exception)
	{
		return new ResponseEntity<>("Categorie not updated",HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(NoStatusFoundException.class)
	public ResponseEntity<Object> exception(NoStatusFoundException exception)
	{
		return new ResponseEntity<>("Status not Found",HttpStatus.NOT_FOUND);
	} 
	@ExceptionHandler(StatusNotUpdatedException.class)
	public ResponseEntity<Object> exception(StatusNotUpdatedException exception)
	{
		return new ResponseEntity<>("Status not updated",HttpStatus.NOT_FOUND);
	}
	
	

}
