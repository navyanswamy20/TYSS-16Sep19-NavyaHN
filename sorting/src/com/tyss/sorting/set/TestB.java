package com.tyss.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {
public static void main(String[] args) {
	HashSet<String> hs = new HashSet<>();
	hs.add("vijay");
	hs.add("ajay");
	hs.add("navya");
	hs.add("sujay");
	hs.add("enjoy");
	
	System.out.println("----using for each-----------");
	for(String s : hs) {
		System.out.println(s);
	}
	System.out.println("-------using iterator-----------");
	Iterator<String> i = hs.iterator();
	while(i.hasNext()) {
		Object s = i.next();
		System.out.println(s);
		
	}
}
}
