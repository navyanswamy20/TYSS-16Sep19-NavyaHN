package com.tyss.objectclass;

public class TestCar {
public static void main(String[] args) {
	CarOver c = new CarOver(100000, "bmw", "blue");
	c.toString();
	System.out.println(c);
	int h=c.hashCode();
	System.out.println(h);
}
}
