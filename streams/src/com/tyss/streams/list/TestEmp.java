package com.tyss.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestEmp {
public static void main(String[] args) {
	ArrayList<Employee> al = new ArrayList<>();
	Employee e1 = new Employee(10, "navya");
	Employee e2 = new Employee(20, "kavya");
	Employee e3 = new Employee(30, "doni");
	Employee e4 = new Employee(40, "virat");
	al.add(e1);
	al.add(e2);
	al.add(e3);
	al.add(e4);
	
	
	Comparator<Employee> cmp = (e5,e6) ->{
		return e5.name.compareTo(e6.name);
	};
	List<Employee> l = al.stream().sorted(cmp).collect(Collectors.toList());
	
	Iterator<Employee> it = l.iterator();
	while(it.hasNext()){
		Employee i =it.next();
		System.out.println("id is "+i.id);
		System.out.println("name is "+i.name);
	
}
}
}
