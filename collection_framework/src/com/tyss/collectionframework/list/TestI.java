package com.tyss.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class TestI {
	public static void main(String[] args) {
		Stack al1 = new Stack<>();
		al1.add(12);
		al1.add(233.6);
		al1.add("momo");
		al1.add(false);
		
		
		System.out.println("---------using for loop----------");
		for(int i = 0;i<al1.size();i++) {
			System.out.println(al1.get(i));
			
		}
		System.out.println("----using for each-------");
		for(Object ob : al1) {
			System.out.println(ob);
			
		
		}
		System.out.println("------------using iterator------------");
		Iterator it = al1.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
			
		}
		System.out.println("-----using list iterator forward--------");
		ListIterator lt =al1.listIterator();
		while(lt.hasNext()) {
			Object o = lt.next();
			System.out.println(o);
		}
		System.out.println("-----using list iterator backward--------");
		while(lt.hasPrevious()) {
			Object o = lt.previous();
			System.out.println(o);
		}
		
	}
	

}
