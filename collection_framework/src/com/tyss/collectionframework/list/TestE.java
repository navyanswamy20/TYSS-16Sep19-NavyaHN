package com.tyss.collectionframework.list;

import java.util.ArrayList;

public class TestE {
public static void main(String[] args) {
	
	ArrayList al = new ArrayList();
	al.add("navya");
	Object o = al.get(0);
	System.out.println(o);
	
	String name = (String)o;	//downcasting
	 name = name.toUpperCase();
	 System.out.println("name is " +name);
	 
}
}
