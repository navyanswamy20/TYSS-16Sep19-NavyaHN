package com.tyss.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {
public static void main(String[] args) {
	
	LinkedHashSet ls = new LinkedHashSet<>();
	
	ls.add(23);
	ls.add(58.3);
	ls.add("navya");
	ls.add("sharu");
	ls.add(58.3);
	ls.add(299);
	ls.add(null);
	ls.add(null);
	
	System.out.println("----using for each-----------");
	for(Object s : ls) {
		System.out.println(s);
	}
	System.out.println("-------using iterator-----------");
	Iterator i = ls.iterator();
	while(i.hasNext()) {
		Object s = i.next();
		System.out.println(s);
		
	}
}
}
