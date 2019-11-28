package com.tyss.wrapperclasses;

public class TestA {
public static void main(String[] args) {
	int a=10;
	System.out.println("a is "+a);
	Integer i = a;	//boxing or autoboxing
	System.out.println("i is "+i);
	
	Integer x = 10;
	Integer z = new Integer(20);
	System.out.println("x is "+x);
	int y = x;	//unboxing auto unboxing
	System.out.println("y is "+y);
	
	int value = Integer.parseInt("123");
	System.out.println("Value is "+value);
	
	int value1 = Integer.parseInt("dshf");	//number format exception
	System.out.println("Value is "+value1);
	
	boolean result = Boolean.parseBoolean("true");
	System.out.println("Result is "+result);
	

}
}
