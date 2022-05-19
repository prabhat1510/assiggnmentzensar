package com.training.olxmaster.exception;

public class NoStatusFoundException  extends Exception{
	public String message;

	public NoStatusFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NoStatusFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public NoStatusFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NoStatusFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NoStatusFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	

}
