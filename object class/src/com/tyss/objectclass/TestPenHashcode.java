package com.tyss.objectclass;

public class TestPenHashcode {
public static void main(String[] args) {
	PenHashcode p = new PenHashcode();
	int PHashcode = p.hashCode();
	System.out.println("hash code value of p is "+PHashcode);
	
	PenHashcode p1 = new PenHashcode();
	int PHashcode1 = p1.hashCode();
	System.out.println("hash code value of p1 is "+PHashcode1);
}
}
