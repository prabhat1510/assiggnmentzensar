package com.olx.demo.exception;

public class NoCATEGORIESFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	String message;

	public NoCATEGORIESFoundException(String message) {
		super(message);
		this.message = message;
	}

	public NoCATEGORIESFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public NoCATEGORIESFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NoCATEGORIESFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
}
