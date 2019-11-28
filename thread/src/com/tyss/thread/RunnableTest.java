package com.tyss.thread;

public class RunnableTest {
public static void main(String[] args) {
	
	System.out.println("main started");
	MyRunnable mr = new MyRunnable();
	Thread t1 = new Thread(mr);
	t1.start();
	
	for(int i=0;i<10;i++) {
		System.out.println("main thread");
	}
	System.out.println("main ended");
}
}
