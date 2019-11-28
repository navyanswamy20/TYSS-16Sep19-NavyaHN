package com.tyss.exception.custom_unchecked_exception;

public class TestAge {
public static void main(String[] args) {
	System.out.println("main started");
	Validator v = new Validator();
	
	try {
		v.verify(10);
	} catch (InvalidAgeException e) {
		System.out.println("exception occured");
	e.printStackTrace();
	}
	v.verify(12);
	System.out.println("main ended");
}

}
