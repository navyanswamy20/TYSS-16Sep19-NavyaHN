package com.tyss.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestIBank {
public static void main(String[] args) {
	
	//SortByName sb = new SortByName();
	//TreeSet<Bank> ts = new TreeSet<Bank>(sb);
	
//	SortByPincode sp = new SortByPincode();
//	TreeSet<Bank> ts = new TreeSet<Bank>(sp);
	
	SortByMicr sm = new SortByMicr();
	TreeSet<Bank> ts = new TreeSet<Bank>(sm);
	
	Bank b1 = new Bank("Vijaya", 100, 123456l);
	Bank b2 = new Bank("canara", 200, 1357911l);
	Bank b3 = new Bank("HDFC", 300, 246810l);
	Bank b4 = new Bank("SBI", 400, 9876543l);
	Bank b5 = new Bank("SBI", 400, 9876543l);
	
	ts.add(b1);
	ts.add(b2);
	ts.add(b3);
	ts.add(b4);
	ts.add(b5);
	System.out.println("-------using iterator-----------");
	Iterator<Bank> i = ts.iterator();
	while(i.hasNext()) {
		Bank b = i.next();
		System.out.println("name is "+b.name);
		System.out.println("pincode is "+b.pincode);
		System.out.println("MICR is "+b.micr);
		System.out.println("================================");
}
}
}
