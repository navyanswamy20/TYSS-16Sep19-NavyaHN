package com.tyss.exception.first;

public class BMS {
	public static void main(String[] args)
	{
		System.out.println("BMS started");
		PVR p = new PVR();
		try {
			p.book();
			
				System.out.println("booking confirmed");
		}
			catch(ArithmeticException ae) 
			{
				System.out.println("booking failed");
			}
		


		System.out.println("BMS ended");
	}

}