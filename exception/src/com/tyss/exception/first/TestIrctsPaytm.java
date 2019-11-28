package com.tyss.exception.first;

public class TestIrctsPaytm {
public static void main(String[] args) {
	System.out.println("main started");
	Paytm p = new Paytm();  
	try {
	p.book();
	}catch(ArithmeticException ae) {
		System.out.println("exception caught in main");
	}finally {
		System.out.println("executing finally");
	}
	System.out.println("main ended");
}
}

