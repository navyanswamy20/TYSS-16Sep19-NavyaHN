package com.tyss.thread.properties;

public class MyThread extends Thread {
	public static void main(String[] args) {
		System.out.println("main started");
		//to get the name of the thread
		String tname = Thread.currentThread().getName();
		System.out.println("current thread name is " +tname);
		
		MyThread t1 = new MyThread();
		String mname = t1.getName();
		System.out.println("my thread name is "+mname);
		//to change the name of the thread
		 Thread.currentThread().setName("momo");
		 
		
		

		System.out.println(10 / 0);

		System.out.println("main ended");
	}

}
