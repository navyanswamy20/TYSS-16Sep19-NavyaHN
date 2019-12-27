package com.tyss.assetmanagementsystem.exception;
public class LoginException extends RuntimeException {
  public String getMessage()
	{
		return "Inavalid Username or Password";
	}
}
