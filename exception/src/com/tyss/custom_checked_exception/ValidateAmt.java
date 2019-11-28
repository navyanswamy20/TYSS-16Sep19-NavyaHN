package com.tyss.custom_checked_exception;

public class ValidateAmt {
	
void checkAmount(int amount) throws InvalidAmountException {
	if(amount > 40000) {
		
		throw new InvalidAmountException();
	}
}
}
