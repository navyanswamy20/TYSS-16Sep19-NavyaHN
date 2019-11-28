package com.tyss.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestEmp {
	public static void main(String[] args) {
		Employee e1 = new Employee(10, "navya", 98000);
		Employee e2 = new Employee(20, "divya", 68000);
		Employee e3 = new Employee(30, "kavya", 72999);
		Employee e4 = new Employee(40, "manya", 8800);
		Employee e5 = new Employee(50, "manu", 66300);
		Employee e6 = new Employee(60, "kali", 9800);
		Employee e7 = new Employee(70, "milky", 69826);
		Employee e8 = new Employee(80, "lalu", 562365);
		Employee e9 = new Employee(90, "sharvari", 78000);
		
		
		ArrayList<Employee> al = new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		ArrayList<Employee> al1 = new ArrayList<>();
		al1.add(e4);
		al1.add(e5);
		al1.add(e6);
		
		ArrayList<Employee> al2 = new ArrayList<>();
		al2.add(e7);
		al2.add(e8);
		al2.add(e9);
		
		HashMap<String, ArrayList<Employee>> hm  = new HashMap<>();
		hm.put("Manager1", al);
		hm.put("Manager2", al1);
		hm.put("Manager3", al2);
		
		ArrayList<Employee> Manager3 =  hm.get("Manager3");
		
		Iterator<Employee> it = Manager3.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("name is "+e.name);
			System.out.println("id is "+e.id);
			System.out.println("salary is "+e.salary);
		}
		
		
}
}