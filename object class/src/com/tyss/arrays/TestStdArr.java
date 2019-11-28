package com.tyss.arrays;

public class TestStdArr {
public static void main(String[] args) {
	StudentArr s1 = new StudentArr(10, "aaa", 69.3);
	StudentArr s2 = new StudentArr(20, "bbb", 79.3);
	StudentArr s3 = new StudentArr(30, "ccc", 89.3);
	
	StudentArr[] students = new StudentArr[3];
	
	students[0]=s1;
	students[1]=s2;
	students[2]=s3;
	
	for(StudentArr s : students) {
		System.out.println(s);
	}
	receive(students);
}
static void receive(StudentArr[] stu) {
	for(StudentArr s : stu) {
		System.out.println(s);
	}
}
}
