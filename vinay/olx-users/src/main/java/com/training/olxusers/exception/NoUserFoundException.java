package com.training.olxusers.exception;
public class NoUserFoundException extends Exception {
	public String message;

	public NoUserFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NoUserFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public NoUserFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NoUserFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NoUserFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}