package com.tyss.thread.ppausing;

public class MyJoinThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("child thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
