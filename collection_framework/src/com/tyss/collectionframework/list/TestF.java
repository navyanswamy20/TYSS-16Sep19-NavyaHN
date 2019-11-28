package com.tyss.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestF {
public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<String>();
	al.add("navya");
	al.add("sharu");
	al.add("kali");
	al.add("mani");
	
	//al.add(2);
	String name = al.get(0);	//return type is string
System.out.println(name.toUpperCase());
Iterator<String> li = al.iterator();
while(li.hasNext()) {
	String s = li.next();
	System.out.println(s);
	}
System.out.println("___________________using list iterator________________");
ListIterator<String> li1 = al.listIterator();
while(li1.hasNext()) {
	String s1 = li1.next();
	System.out.println(s1);
}
	
System.out.println("------using for each------------");
for(String n : al) {
	System.out.println(n);
}
}
}
