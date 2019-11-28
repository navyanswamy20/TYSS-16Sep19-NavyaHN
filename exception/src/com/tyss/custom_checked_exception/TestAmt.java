package com.tyss.custom_checked_exception;

public class TestAmt {
public static void main(String[] args) {
	System.out.println("main started");
	
	ValidateAmt va =new ValidateAmt();
	try {
		va.checkAmount(50000);
		System.out.println("withdraw your cash");
	} catch (InvalidAmountException e) {
		//e.printStackTrace();
		System.err.println(e.getMessage()); ;
	}
	
	System.out.println("main ended");
}
}
