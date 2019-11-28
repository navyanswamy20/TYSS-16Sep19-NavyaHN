package com.tyss.exception.second;

public class testA {
	public static void main(String[] args) {
		System.out.println("main started");
		try 
		{
			Thread.sleep(3000);
			System.out.println("inside try");
		}
		catch(InterruptedException ie)
		{
			System.out.println("exception caught");
			ie.printStackTrace();
		}
		System.out.println("main ended");
	}
}
