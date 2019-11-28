package com.tyss.collectionframework.list;

import java.util.ArrayList;

public class TestStudent {
public static void main(String[] args) {
	ArrayList<Student> al = new ArrayList<Student>();
	Student s1 = new Student(10, "navya", 69.5);
	Student s2 = new Student(20, "kavya", 63.5);
	Student s3 = new Student(30, "divya", 99.5);
	
	al.add(s1);
	al.add(s2);
	al.add(s3);
	
	for(int i=0;i<al.size();i++) {
		Student s =al.get(i);
		System.out.println("id is "+s.id);
		System.out.println("name is "+s.name);
		System.out.println("percentage is "+s.percentage);
	}
	
	System.out.println("---------for each------");
	
	for(Student s : al) {
		System.out.println(s);
	}
	
	
}
}
