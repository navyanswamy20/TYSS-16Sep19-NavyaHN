package com.tyss.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;



public class HelperStu {
	Comparator<Student> cmp= (s1,s2)->{
		if(s1.percentage>s2.percentage) {
			return 1;
		}else if(s1.percentage<s2.percentage) {
			return -1;
		}else {
			return 0;
		}
	};
	
	Comparator<Student> cmp1= (s1,s2)->{
		if(s1.percentage>s2.percentage) {
			return 1;
		}else if(s1.percentage<s2.percentage) {
			return -1;
		}else {
			return 0;
		}
	};
void displayAllStudents(ArrayList<Student> al) {
	
 
	Iterator<Student> it = al.iterator();
	while(it.hasNext()){
		Student i =it.next();
		System.out.println("name is "+i.name);
		System.out.println("id is "+i.id);
		System.out.println("percentage is "+i.percentage);
		System.out.println("====================================");
}
}
	void displayFailedStudent(ArrayList<Student> al) {
		List<Student> l = 
				al.stream().filter(student -> student.percentage<40).collect(Collectors.toList());
		Iterator<Student> it = l.iterator();
		while(it.hasNext()){
			Student i =it.next();
			System.out.println("name is "+i.name);
			System.out.println("id is "+i.id);
			System.out.println("percentage is "+i.percentage);
			System.out.println("====================================");
	}
	}
	
	void displayPassedStudent(ArrayList<Student> al) {
		List<Student> l = 
				al.stream().filter(student -> student.percentage>=40).collect(Collectors.toList());
		Iterator<Student> it = l.iterator();
		while(it.hasNext()){
			Student i =it.next();
			System.out.println("name is "+i.name);
			System.out.println("id is "+i.id);
			System.out.println("percentage is "+i.percentage);
			System.out.println("====================================");
	}
	}
	
	void displayTopperStudent(ArrayList<Student> al) {
		
				Student s = al.stream().max((cmp)).get();
		
			System.out.println("name is "+s.name);
			System.out.println("id is "+s.id);
			System.out.println("percentage is "+s.percentage);
			System.out.println("====================================");
	}
	
	void displayLowerStudent(ArrayList<Student> al) {
		
		Student s = al.stream().min((cmp1)).get();

	System.out.println("name is "+s.name);
	System.out.println("id is "+s.id);
	System.out.println("percentage is "+s.percentage);
	System.out.println("====================================");
}
	}
	

