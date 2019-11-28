package com.tyss.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
public static void main(String[] args) {
	
	ArrayList al = new ArrayList();
	
	al.add(10);
	al.add(29.3);
	al.add(true);
	al.add("navya");
	Iterator it = al.iterator();
	
	Object ob1 = it.next();
	System.out.println("object 1= " +ob1);
	
	Object ob2 = it.next();
	System.out.println("object 2= " +ob2);
	
	Object ob3 = it.next();
	System.out.println("object 3= " +ob3);
	
	Object ob4 = it.next();
	System.out.println("object 4= " +ob4);
	
	boolean b = it.hasNext();
	System.out.println("has next " +b);
	
//	Object ob5 = it.next();
//	System.out.println("object 1= " +ob5);
	//NoSuchElementException
	
	System.out.println("size of the arraylist is " +al.size());
	
	System.out.println("_______________________using for loop____________________________");
	
	for(int i = 0;i < al.size();i++) {
		Object obj = al.get(i);
		System.out.println(obj);
		
	}
	
	ArrayList al1 = new ArrayList<>();
	al1.add(12);
	al1.add(233.6);
	al1.add("momo");
	al1.add(false);
	
	System.out.println("_______________________using iterator____________________________");
	Iterator it1 = al1. iterator();
	while(it1.hasNext()) {
		Object o = it1.next();
		System.out.println(o);
	}
}
}
