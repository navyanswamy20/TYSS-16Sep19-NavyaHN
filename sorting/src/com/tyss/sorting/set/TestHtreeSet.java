package com.tyss.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestHtreeSet {
	public static void main(String[] args) {
		TreeSet<Employee> hs = new TreeSet<>();
		Employee e1 = new Employee(12, "navya", 25000);
		Employee e2 = new Employee(34, "sharu", 15000);
		Employee e3 = new Employee(5, "teju", 50000);
		Employee e4 = new Employee(25, "kali", 10000);
		Employee e5 = new Employee(25, "kali", 10000);
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		System.out.println("-------using iterator-----------");
		Iterator<Employee> i = hs.iterator();
		while(i.hasNext()) {
			Employee e = i.next();
			System.out.println("Id is "+e.id);
			System.out.println("name is "+e.name);
			System.out.println("salary is "+e.salary);
			System.out.println("----------------------------------------");
			
			
		}

		}
	}
