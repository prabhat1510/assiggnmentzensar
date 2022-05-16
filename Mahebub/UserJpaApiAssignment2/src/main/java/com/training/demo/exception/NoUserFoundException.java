package com.training.demo.exception;

public class NoUserFoundException extends Exception {
	private static final long serialVersionUID = 1L;
	
	String message;
	public NoUserFoundException(String message) {
        super(message);
        this.message = message;
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
	public NoUserFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
}
