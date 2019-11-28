package com.tyss.java8features;

import java.util.function.Consumer;

public class TestConsumer {
public static void main(String[] args) {
	
	Consumer<Student> c = (s) -> {
		System.out.println("id is "+s.id);
		System.out.println("name is "+s.name);
		System.out.println("percentage is "+s.percentage);
		System.out.println("**********************************");
	};
	
	Student s1 = new Student(56, "bhoomi", 75.5);
	c.accept(s1);
}
}
