package com.tyss.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class TestK {
public static void main(String[] args) {
	ArrayList<Double> al  = new ArrayList<Double>();
	al.add(32.5);
	al.add(25.9);
	al.add(53.9);
	al.add(89.3);
	al.add(89.3);
	al.add(null);
	al.add(null);
	
	System.out.println(al);
	al.add(2, 56.4);
	System.out.println("after add in 2nd index "+al);
	al.remove(0);
	System.out.println("after remove from zero index "+al);
	al.remove(null);
	System.out.println("after removing null "+al);
	Double val = al.get(4);
	System.out.println("object at 4th index "+val);
	al.set(2, 77.6);
	System.out.println("after repalcing at the 2nd index "+al);
	al.clear();
	System.out.println("after clear method "+al);
	al.contains(54.6);
	
	System.out.println("==========================================");
	
	List<Double> al1  = new ArrayList<Double>();
	al1.add(12.0);
	al1.add(12.9);
	al1.add(45.9);
	al1.add(23.6);
	
	al.addAll(al1);
	System.out.println("after add all method "+al);
	boolean contain = al.containsAll(al1);
	System.out.println("contains all "+contain);
	boolean res = al.removeAll(al1);
	System.out.println("remove all from al1 "+res);
	System.out.println("after romove "+al);
	
	
}
}
