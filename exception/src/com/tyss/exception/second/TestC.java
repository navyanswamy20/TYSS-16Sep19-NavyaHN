package com.tyss.exception.second;

import java.util.Scanner;

public class TestC {
public static void main(String[] args) {
	try(Scanner sc = new Scanner(System.in)){
		System.out.println("enter age");
		int age = sc.nextInt();
		System.out.println("age is "+age);
		
		System.out.println(age/0);
		
		
	}catch(ArithmeticException ae) {
		ae.printStackTrace();
	}finally {
		System.out.println("finally executed");
	}
	System.out.println("----------------------------");
//	try {
//		System.out.println("only try block is invalid");
//	}
	//System.out.println(" try block with resources is valid");
	
}
}









































































































