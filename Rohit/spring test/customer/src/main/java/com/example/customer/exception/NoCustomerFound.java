package com.example.customer.exception;

public class NoCustomerFound extends Exception {
	public String message;

	public NoCustomerFound() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NoCustomerFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public NoCustomerFound(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NoCustomerFound(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NoCustomerFound(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	

}
