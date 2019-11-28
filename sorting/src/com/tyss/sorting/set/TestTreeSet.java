package com.tyss.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {
public static void main(String[] args) {
	TreeSet ts =new TreeSet<>();
	ts.add(89);
	ts.add(10);
	ts.add(25);
	ts.add(36);
	ts.add(56);
	//ts.add("navya");	ClassCastException only one type of data
	
	//ts.add(89);	 no duplicates
	//ts.add(null);		 null can not be used
	System.out.println("----using for each-----------");
	for(Object s : ts) {
		System.out.println(s);
	}
	System.out.println("-------using iterator-----------");
	Iterator i = ts.iterator();
	while(i.hasNext()) {
		Object s = i.next();
		System.out.println(s);
		
	}
}
}
