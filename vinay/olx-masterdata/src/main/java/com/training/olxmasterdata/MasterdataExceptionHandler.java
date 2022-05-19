package com.training.olxmasterdata;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.training.olxmasterdata.exceptions.CategorieNotUpdate;
import com.training.olxmasterdata.exceptions.NoCategoriesFoundException;
import com.training.olxmasterdata.exceptions.NoStatusFoundException;
import com.training.olxmasterdata.exceptions.StatusNotUpdatedException;

public class MasterdataExceptionHandler {
	@ExceptionHandler(CategorieNotUpdate.class)
	public ResponseEntity<Object> exception(CategorieNotUpdate exception)
	{
		return new ResponseEntity<>("CategorieNotUpdate",HttpStatus.NOT_FOUND);
	} 
	@ExceptionHandler(NoCategoriesFoundException.class)
	public ResponseEntity<Object> exception(NoCategoriesFoundException exception)
	{
		return new ResponseEntity<>("NoCategoriesFoundException",HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(NoStatusFoundException.class)
	public ResponseEntity<Object> exception(NoStatusFoundException exception)
	{
		return new ResponseEntity<>("NoStatusFoundException",HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(StatusNotUpdatedException.class)
	public ResponseEntity<Object> exception(StatusNotUpdatedException exception)
	{
		return new ResponseEntity<>("StatusNotUpdatedException",HttpStatus.NOT_FOUND);
}
}