package com.tyss.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestA {
public static void main(String[] args) {
	HashSet hs = new HashSet<>();
	hs.add(12);
	hs.add(23.6);
	hs.add("navya");
	hs.add(25);
	//hs.add(25);	duplicates are not allowed
	hs.add(null);
	//hs.add(null);		only one null value is allowed
	//hs.get(4);	set do not have index so we can not use get()
	
	System.out.println("----using for each---------");
	for(Object o : hs) {
		System.out.println(o);
	}
	System.out.println("---------using iterator-----------");
	Iterator i = hs.iterator();
	while(i.hasNext()) {
		Object s = i.next();
		System.out.println(s);
		
	}
}
}
