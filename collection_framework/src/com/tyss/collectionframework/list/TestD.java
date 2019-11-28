package com.tyss.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestD {
public static void main(String[] args) {
	ArrayList al = new ArrayList<>();
	al.add(12);
	al.add(233.6);
	al.add("momo");
	al.add(false);
	ListIterator li = al.listIterator();
	System.out.println("------------------>forward");
	while(li.hasNext()) {
		Object ob = li.next();
		System.out.println(ob);
	}
	System.out.println("backward<---------------------");
	while(li.hasPrevious()) {
		Object o = li.previous();
		System.out.println(o);
	}
	
}
}
