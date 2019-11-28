package com.tyss.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestA {
	public static void main(String[] args) {


		ArrayList<Student> al = new ArrayList<>();

		Student s1 = new Student(90, "NAVya", 89.3);
		Student s2 = new Student(10, "DiVYa", 69.3);
		Student s3 = new Student(80, "kavYA", 79.3);
		Student s4 = new Student(20, "SHaru", 99.3);

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		System.out.println("before sorting");
		displayStudentDetails(al);
		Collections.sort(al);
		System.out.println("after sorting");
		displayStudentDetails(al);

	}
	static void displayStudentDetails(ArrayList<Student> al) {
		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("name is "+s.name);
			System.out.println("percentage is "+s.percentage);
			System.out.println("-----------------------------");
			
			
		}
	}
}
