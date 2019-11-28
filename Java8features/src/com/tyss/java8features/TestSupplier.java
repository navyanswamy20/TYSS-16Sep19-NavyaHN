package com.tyss.java8features;

import java.util.function.Supplier;

public class TestSupplier {
public static void main(String[] args) {
	
	System.out.println("------Student type supplier-------");
	
	Supplier<Student> s = ()-> new Student(2, "navya", 67.9);
	Student st = s.get();
	System.out.println("student details ");
	System.out.println("id is "+st.id);
	System.out.println("name is "+st.name);
	System.out.println("percentage is "+st.percentage);
	
	System.out.println("------Integer supplier-------");
	
	Supplier<Integer> i = () -> 20;
	int val = i.get();
	System.out.println("value is "+val);
	
	System.out.println("------String supplier-------");
	
	Supplier<String> str = () -> "navya is a good girl";
	String val1 = str.get();
	System.out.println("value is "+val1);
	
	
}
}
