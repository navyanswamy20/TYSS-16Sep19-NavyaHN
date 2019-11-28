package com.tyss.lambdaexpressions;

public class TestGreet {
public static void main(String[] args) {
	GreetInterface greet1 = (msg) -> {
		System.out.println("hello");
		return msg;
	};
	String s= greet1.greet("hellooo");
	
	System.out.println("message is " +s);
	
}

}
