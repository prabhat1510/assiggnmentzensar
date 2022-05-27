package com.assignment.demo.exceptions;

public class NoCategoriesFoundException extends Exception {

	public NoCategoriesFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NoCategoriesFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public NoCategoriesFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NoCategoriesFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NoCategoriesFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	String message;
}
