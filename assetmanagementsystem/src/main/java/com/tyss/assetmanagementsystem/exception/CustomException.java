package com.tyss.assetmanagementsystem.exception;

public class CustomException extends RuntimeException{

	public CustomException(String string)
	{
		System.err.println(string);
	}
}
