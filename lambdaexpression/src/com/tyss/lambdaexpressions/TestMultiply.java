package com.tyss.lambdaexpressions;

public class TestMultiply {
public static void main(String[] args) {
	
	MultiplyInterface multi = (a,b) -> a * b;	//lambda expression should be hold in functional interface
	int product = multi.multiply(20, 10);
	System.out.println("product is " +product);
}
}
