package com.tyss.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestFTreeSet {
	public static void main(String[] args) {
		TreeSet<String> ts =new TreeSet<>();
		ts.add("navya");
		ts.add("divya");
		ts.add("sharvari");
		ts.add("roopa");
		ts.add("kalli");
		//ts.add("navya");	ClassCastException only one type of data
		
		//ts.add(89);	 no duplicates
		//ts.add(null);		 null can not be used
		System.out.println("----using for each-----------");
		for(Object s : ts) {
			System.out.println(s);
		}
		System.out.println("-------using iterator-----------");
		Iterator<String> i = ts.iterator();
		while(i.hasNext()) {
			String s = i.next();
			System.out.println(s);
			
		}
	}
	}
