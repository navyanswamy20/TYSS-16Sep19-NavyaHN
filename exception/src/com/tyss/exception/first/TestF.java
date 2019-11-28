package com.tyss.exception.first;

public class TestF {
public static void main(String[] args) {
	System.out.println("main started");
	
	String s = "heloo";	//String s = null; Null
	
	int []a = {10,20,30};
	int b = 10;
	try {
		String s1 = s.toUpperCase();
		System.out.println(s1);
		System.out.println(a[6]);
		System.out.println(b/0);
		
	}
	
	catch(NullPointerException ne) {
		System.out.println("do not playwith null");
	}
	catch(ArrayIndexOutOfBoundsException ae) {
		System.out.println("array index out of bound");
	}
	catch(ArithmeticException are)
	{
		System.out.println("number is not divided by zero");
	}
	
	
			
	System.out.println("main ended");
}
}
