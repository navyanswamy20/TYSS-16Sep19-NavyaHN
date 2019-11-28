package com.tyss.java8.predicate;

import java.util.function.Predicate;

public class TestEmp {
	public static void main(String[] args) {
		
		Predicate<Employee> p = e->{
			if(e.salary>= 25000){
				return true;
			} else {
				return false;
			}
		};
		
		Employee e = new Employee(10, "navya", 99000);
		boolean res = p.test(e);
		System.out.println("result is= "+res);
	}
	}
