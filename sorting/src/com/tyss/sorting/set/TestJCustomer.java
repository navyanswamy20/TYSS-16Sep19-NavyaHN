package com.tyss.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJCustomer {
	
public static void main(String[] args) {
	
	CustSortByName sn = new CustSortByName();
	TreeSet<Customer> ts = new TreeSet<Customer>(sn);

	Customer c1 = new Customer("navya", 10, 25600);
	Customer c2 = new Customer("kali", 20, 56000);
	Customer c3 = new Customer("sharu", 30, 15600);
	Customer c4 = new Customer("divya", 40, 5600);
	
	ts.add(c1);
	ts.add(c2);
	ts.add(c3);
	ts.add(c4);
	
	System.out.println("-------using iterator-----------");
	Iterator<Customer> i = ts.iterator();
	while(i.hasNext()) {
		Customer c = i.next();
		System.out.println("name is "+c.name);
		System.out.println("id is "+c.id);
		System.out.println("salary is "+c.salary);
		System.out.println("================================");
}
}
}
