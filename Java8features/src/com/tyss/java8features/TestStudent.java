package com.tyss.java8features;

import java.util.function.Predicate;

public class TestStudent {
public static void main(String[] args) {
	
	Predicate<Student> p = s->{
		if(s.percentage>= 35){
			return true;
		} else {
			return false;
		}
	};
	
	Student s = new Student(10, "navya", 99.9);
	boolean res = p.test(s);
	System.out.println("result is= "+res);
}
}
