package com.olx.demo.exception;

public class NoADV_STATUSFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	String message;

	public NoADV_STATUSFoundException(String message) {
		super(message);
		this.message = message;
	}

	public NoADV_STATUSFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public NoADV_STATUSFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NoADV_STATUSFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
}
