package com.tyss.singleton;

public class MySingleton {
	private static MySingleton instance = null;
	String s;

	private MySingleton() {
	}

	public static MySingleton getBdConnection() {
		if(instance == null) {
			instance = new MySingleton();
			return instance;
		}
		else {
			return instance;
		}
	}
}
