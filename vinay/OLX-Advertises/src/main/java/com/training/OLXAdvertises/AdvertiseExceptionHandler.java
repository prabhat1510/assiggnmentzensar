package com.training.OLXAdvertises;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.training.OLXAdvertises.exception.AdvertisesNotUpdatedException;
import com.training.OLXAdvertises.exception.NoAdvertisesFoundException;

public class AdvertiseExceptionHandler {
	@ExceptionHandler(NoAdvertisesFoundException.class)
	public ResponseEntity<Object> exception(NoAdvertisesFoundException exception)
	{
		return new ResponseEntity<>("Advertise not Found",HttpStatus.NOT_FOUND);
	} 
	@ExceptionHandler(AdvertisesNotUpdatedException.class)
	public ResponseEntity<Object> exception(AdvertisesNotUpdatedException exception)
	{
		return new ResponseEntity<>("Advertise not updated",HttpStatus.NOT_FOUND);
	}
	
}
