package com.tyss.exception.custom_unchecked_exception;

public class InvalidAgeException extends RuntimeException {
	
private String msg = "Invalid age";
 public InvalidAgeException() {
	
}

 public InvalidAgeException(String msg) {
	this.msg = msg;
}
@Override
	public String getMessage() {
	return msg;
	}
}
