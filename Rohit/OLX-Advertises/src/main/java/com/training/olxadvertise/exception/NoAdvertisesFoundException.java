package com.training.olxadvertise.exception;

public class NoAdvertisesFoundException extends Exception {
	public String message;

	public NoAdvertisesFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NoAdvertisesFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public NoAdvertisesFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NoAdvertisesFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NoAdvertisesFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	

}
