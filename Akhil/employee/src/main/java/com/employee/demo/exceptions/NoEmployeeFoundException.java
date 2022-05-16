package com.employee.demo.exceptions;

public class NoEmployeeFoundException extends Exception {
	String message;

	public NoEmployeeFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NoEmployeeFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public NoEmployeeFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NoEmployeeFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NoEmployeeFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	

}
