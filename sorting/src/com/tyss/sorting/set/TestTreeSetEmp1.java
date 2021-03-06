package com.tyss.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSetEmp1 {
public static void main(String[] args) {
	
	Comparator<Employee1>comp = (e1,e2) -> {
		if(e1.height > e2.height) {
			return 1;
		}else if(e1.height < e2.height) {
			return -1;
		}else {
			return 0;
		}
	};
	
	TreeSet<Employee1> ts = new TreeSet<>(comp);
	Employee1 e1 = new Employee1(12, "navya", 2.6);
	Employee1 e2 = new Employee1(34, "sharu", 6.00);
	Employee1 e3 = new Employee1(5, "teju", 5.1);
	Employee1 e4 = new Employee1(25, "kali", 4.9);
	Employee1 e5 = new Employee1(25, "kali", 5.3);
	
	ts.add(e1);
	ts.add(e2);
	ts.add(e3);
	ts.add(e4);
	ts.add(e5);
	
	System.out.println("-------using iterator-----------");
	Iterator<Employee1> i = ts.iterator();
	while(i.hasNext()) {
		Employee1 e = i.next();
		System.out.println("name is "+e.name);
		System.out.println(("Id is "+e.id));
		System.out.println("height is "+e.height);
		
	}
}
}
