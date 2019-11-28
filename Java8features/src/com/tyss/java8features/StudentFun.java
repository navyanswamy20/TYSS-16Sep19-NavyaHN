package com.tyss.java8features;

import java.util.function.Function;

public class StudentFun {
public static void main(String[] args) {
	
	Function<Integer, Student> f = id -> {
		
		Student s = new Student(2, "navya", 69.3);
		s.id = id;
		return s;
		
	};
	Student s = f.apply(30);
	System.out.println("id is "+s.id);
	System.out.println("name is "+s.name);
	System.out.println("percentage is "+s.percentage);
}
}
