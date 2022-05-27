package com.example.demo.exception;

public class Advertiseexception extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String message;

	public Advertiseexception(String message) {
		super(message);
		this.message = message;
	}

	public Advertiseexception(String message, Throwable cause, boolean enableSuppression,boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public Advertiseexception(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public Advertiseexception(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}