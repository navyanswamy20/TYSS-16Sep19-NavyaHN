package com.tyss.custom_checked_exception;

public class InvalidAmountException extends Exception{

	String msg = "daily limit is 40k";

	@Override
	public String getMessage() {
		return msg;
	}
}
