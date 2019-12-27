package com.tyss.assetmanagementsystem.exception;
public class RaiseRequestException extends RuntimeException {
	public String getMessage()
	{
		return "Employee for whom you raise the request is not in the organisation";
	}
}