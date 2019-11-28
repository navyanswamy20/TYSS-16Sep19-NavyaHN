package com.tyss.exception.custom_unchecked_exception;

public class Validator {
void verify(int age) {
	if(age < 18) {
		throw new InvalidAgeException("try again");
	}
}
}
