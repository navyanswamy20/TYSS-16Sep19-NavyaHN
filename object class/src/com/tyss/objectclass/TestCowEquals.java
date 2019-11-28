package com.tyss.objectclass;

public class TestCowEquals {
public static void main(String[] args) {
	CowEquals c1 = new CowEquals(10, "ganga", 10000);
	CowEquals c2 = new CowEquals(20, "tunga", 20000);
	CowEquals c3 = new CowEquals(10, "ganga", 10000);
	CowEquals c4 = c3;
	
	boolean isequal = c1.equals(c2);
	System.out.println(c1.equals(c3));
	System.out.println(c3.equals(c4));
}
}
