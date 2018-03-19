package com.restapi.message.resource.exception;

public class DataNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1920911745811657361L;
	
	public DataNotFoundException(String message){
		super(message);
	}
}
