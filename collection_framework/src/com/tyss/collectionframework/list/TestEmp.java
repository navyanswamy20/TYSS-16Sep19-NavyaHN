package com.tyss.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestEmp {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		Employee e1 = new Employee(10, "navya", 20000);
		Employee e2 = new Employee(20, "kavya", 60000);
		Employee e3 = new Employee(30, "divya", 30000);
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		for(int i=0;i<al.size();i++) {
			Employee e =al.get(i);
			System.out.println("id is "+e.eid);
			System.out.println("name is "+e.name);
			System.out.println("percentage is "+e.sal);
		}
		
		System.out.println("---------for each------");
		
		for(Employee e : al) {
			System.out.println(e);
		}
		
		System.out.println("---------thorugh iterator------");
		Iterator<Employee> li = al.iterator();
		while(li.hasNext()) {
			Employee s = li.next();
			System.out.println(s);
			}
	}
	}
