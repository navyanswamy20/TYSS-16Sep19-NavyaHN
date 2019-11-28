package com.tyss.java8features;

import java.util.ArrayList;

public class TestStu {
public static void main(String[] args) {
	ArrayList<Student> al = new ArrayList<>();
	
	
	
	al.add(new Student(5, "navya", 96.3));
	al.add(new Student(10, "kavya", 66.3));
	al.add(new Student(25, "divya", 56.3));
	al.add(new Student(15, "manu", 26.3));
	al.add(new Student(30, "lalu", 30.3));
	
	HelperStu hs = new HelperStu();
//	hs.displayAllStudents(al);
//	hs.displayFailedStudent(al);
//	hs.displayPassedStudent(al);
	//hs.displayTopperStudent(al);
	hs.displayLowerStudent(al);
}
}
