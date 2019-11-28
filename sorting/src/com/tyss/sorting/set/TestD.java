package com.tyss.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {
public static void main(String[] args) {
	LinkedHashSet<Double> ls = new LinkedHashSet<>();
	ls.add(25.6);
	ls.add(36.3);
	ls.add(58.9);
	ls.add(25.8);
	ls.add(99.9);
	
	System.out.println("----using for each-----------");
	for(Double s : ls) {
		System.out.println(s);
	}
	System.out.println("-------using iterator-----------");
	Iterator<Double> i = ls.iterator();
	while(i.hasNext()) {
		Double s = i.next();
		System.out.println(s);
		
	}
}
}
