package com.olx.demo.exception;

public class NoUsersFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	String message;

	public NoUsersFoundException(String message) {
		super(message);
		this.message = message;
	}

	public NoUsersFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public NoUsersFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NoUsersFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
}
