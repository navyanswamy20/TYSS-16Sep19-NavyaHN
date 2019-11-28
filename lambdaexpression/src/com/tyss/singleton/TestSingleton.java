package com.tyss.singleton;

public class TestSingleton {
	public static void main(String[] args) {
		
	
//MySingleton ms = new MySingleton();	because constructor is private
	MySingleton ms =  MySingleton. getBdConnection();
	ms.s = "hi";
	System.out.println("hashcode of ms is "+ms.hashCode());
	
	MySingleton mx =  MySingleton.getBdConnection();
	mx.s = "hello";
	System.out.println("hashcode of mx is "+mx.hashCode());
	System.out.println(ms.s);
	System.out.println(mx.s);
}
}