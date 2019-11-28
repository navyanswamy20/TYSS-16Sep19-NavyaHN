package com.tyss.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestB {
public static void main(String[] args) {
	LinkedList<Laptop> li = new LinkedList<>();
	Laptop l1 = new Laptop(25000, 4, "HP");
	Laptop l2 = new Laptop(35000, 16, "Dell");
	Laptop l3 = new Laptop(39000, 8, "Lenovo");
	Laptop l4 = new Laptop(50000, 12, "Mac");
	li.add(l1);
	li.add(l2);
	li.add(l3);
	li.add(l4);
	li.add(new Laptop(26000, 2, "Acer"));
	
	Collections.sort(li);
	displayLaptopDetails(li);
	
	
}
static void displayLaptopDetails(LinkedList<Laptop> l) {
	Iterator<Laptop> it = l.iterator();
	while(it.hasNext()) {
		Laptop lp = it.next();
		System.out.println("brand is "+lp.name);
		System.out.println("Price is "+lp.price);
		System.out.println("Ram is "+lp.ram);
		
	}
}
}
