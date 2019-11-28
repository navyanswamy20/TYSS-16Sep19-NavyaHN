package com.tyss.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestStudent {
public static void main(String[] args) {
	Student s1 = new Student(10, "navya", 98.3);
	Student s2 = new Student(20, "divya", 68.3);
	Student s3 = new Student(30, "kavya", 78.3);
	Student s4 = new Student(40, "manya", 88.3);
	Student s5 = new Student(50, "manu", 66.8);
	Student s6 = new Student(60, "kali", 98.9);
	Student s7 = new Student(70, "milky", 69.8);
	Student s8 = new Student(80, "lalu", 56.8);
	Student s9 = new Student(90, "sharvari", 78.8);
	
	
	ArrayList<Student> al = new ArrayList<>();
	al.add(s1);
	al.add(s2);
	al.add(s3);
	
	ArrayList<Student> al1 = new ArrayList<>();
	al1.add(s4);
	al1.add(s5);
	al1.add(s6);
	
	ArrayList<Student> al2 = new ArrayList<>();
	al2.add(s7);
	al2.add(s8);
	al2.add(s9);
	
	HashMap<String, ArrayList<Student>> hm  = new HashMap<>();
	hm.put("first", al);
	hm.put("second", al1);
	hm.put("third", al2);
	
	ArrayList<Student> second =  hm.get("second");
	
	Iterator<Student> it = second.iterator();
	while(it.hasNext()) {
		Student s = it.next();
		System.out.println("name is "+s.name);
		System.out.println("id is "+s.id);
		System.out.println("percentage is "+s.percentage);
	}
	

}
}
