package com.tyss.collectionframework.list;

import java.util.Collections;
import java.util.LinkedList;

public class TestL {
public static void main(String[] args) {
	LinkedList<Integer> l = new LinkedList<>();
	l.add(12);
	l.add(63);
	l.add(58);
	l.add(32);
	l.add(10);
	
	 System.out.println("befor sorting "+l);
	Collections.sort(l);
	System.out.println("after sort "+l);
	
	Collections.reverse(l);
	System.out.println("after reverse "+l);
	
	Collections.shuffle(l);
	System.out.println("after shuffle "+l);
}
}
