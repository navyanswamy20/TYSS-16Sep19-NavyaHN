package com.tyss.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestPenMarker {
public static void main(String[] args) {
	ArrayList<Marker> al = new ArrayList<>();
	al.add(new Marker(50, "blue"));
	al.add(new Marker(60, "black"));
	al.add(new Marker(55, "green"));
	al.add(new Marker(20, "red"));
	
	System.out.println("before sorting");

	display(al);
	//SortByPrice sb = new SortByPrice();
	SortByColor sc = new SortByColor();
	//Collections.sort(al,sb);
	Collections.sort(al,sc);
	
	System.out.println("after sorting");
	display(al);
	
}
static void display(ArrayList<Marker> a) {
	Iterator<Marker> it = a.iterator();
	while(it.hasNext()) {
		Marker m = it.next();
		System.out.println("price is "+m.price);
		System.out.println("color is "+m.color);
	}
}
}
