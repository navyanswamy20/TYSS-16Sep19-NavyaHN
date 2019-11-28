package com.tyss.exception.first;

public class TestC {
public static void main(String[] args) {
	System.out.println("main started");
	
	int [] a = {10,20,30};
	int b = 10;
	try {
		System.out.println(a[1]);
		System.out.println(b/0);
	}catch(ArithmeticException ae) {
	System.out.println("number is divisible by zero");
}
	catch(ArrayIndexOutOfBoundsException are) {
		System.out.println("array index not present");
	}
	
	System.out.println("main ended");
}
}
