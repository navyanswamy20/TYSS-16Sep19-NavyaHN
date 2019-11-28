package com.tyss.thread.properties;

public class MyIDThread extends Thread {
public static void main(String[] args) {
	System.out.println("main started");
	System.out.println(Thread.currentThread().getId());
	MyIDThread mi = new  MyIDThread();
	System.out.println("myid thread "+mi.getId());
	//mi.setId();we can not set the id of the thread
	System.out.println("priority is "+Thread.currentThread().getPriority());
	
	//Thread.currentThread().setPriority(56); throws IllegalArgumentException
	System.out.println("main ended");
	
}
}
