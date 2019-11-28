package com.tyss.objectclass;

public class TestEmp {
	public static void main(String[] args) {
		Employee e1 = new Employee(100, "gangae", 10000);
		Employee e2 = new Employee(200, "tungae", 20000);
		Employee e3 = new Employee(100, "gangae", 10000);
		Employee e4 = e3;
		
		boolean isequal = e1.equals(e2);
		System.out.println(e1.equals(e3));
		System.out.println(e3.equals(e4));
	}
	}
