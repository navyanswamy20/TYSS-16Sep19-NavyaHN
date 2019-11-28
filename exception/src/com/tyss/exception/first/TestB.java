package com.tyss.exception.first;

public class TestB {
public static void main(String[] args) {
	System.out.println("main started");
	int a = 10;
	int b = 0;
	try {
		b = 10/5;
		System.out.println(b);
		System.out.println("hello");
		System.out.println("happy deepavali");
	}
	catch(ArithmeticException e) {
		System.out.println("number is divided by zero");
	}
	
	System.out.println("main ended");
}
}
