package com.example.demo.exception;

public class NoDataFoundException extends Exception{
	String message;

	public NoDataFoundException() {
		super();
		
	}

	public NoDataFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public NoDataFoundException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public NoDataFoundException(String message) {
		super(message);
		
	}

	public NoDataFoundException(Throwable cause) {
		super(cause);
		
	}

}
