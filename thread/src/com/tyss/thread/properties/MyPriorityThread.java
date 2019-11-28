package com.tyss.thread.properties;

public class MyPriorityThread extends Thread
{
public static void main(String[] args) {
	//JVM provide default priority to main thread as 5
	System.out.println("main started");
	int p = Thread.currentThread().getPriority();
	System.out.println("main thred priority  "+p);
	
	Thread.currentThread().setPriority(7);
	System.out.println("main thread priority "+Thread.currentThread().getPriority());
	
	MyPriorityThread t = new MyPriorityThread();
	int q = t.getPriority();
	System.out.println("mypriority thread priority "+q);
	
	t.setPriority(6);
	System.out.println("mypriority thread priority "+t.getPriority());
	System.out.println("main ended");
}
}
