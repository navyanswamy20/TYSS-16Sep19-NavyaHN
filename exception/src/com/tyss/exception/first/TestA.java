package com.tyss.exception.first;

public class TestA {
public static void main(String[] args) {
	System.out.println("main started");
	
	int[] a = {10,20,30,40};
	System.out.println(a[3]);
	try {
	System.out.println(a[1]);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("index is not present");
	}
	System.out.println("main ended");
	
}
}