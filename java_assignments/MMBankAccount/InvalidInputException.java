package com.cg.inheritance;

public class InvalidInputException extends RuntimeException{
	public InvalidInputException(String message) {
		super(message);
	}
	
	public InvalidInputException() {

	}

}