package com.tyss.typecasting.primitive;

public class TestA {
	public static void main(String[] args) {
		byte a = 10;
		int b = a; //implicit casting
		System.out.println("b value is "+b);
		int p = 30;
		double q = p;
		System.out.println("q value is "+q);

		System.out.println("---------------------------------------------");

		double x = 20.69;
		int y = (int) x;	//explicit casting
		System.out.println("y value is "+y);
		byte z = (byte) x;
		System.out.println("z value is "+z);
		char n = (char) x;
		System.out.println("n value is "+n);
	}
}
