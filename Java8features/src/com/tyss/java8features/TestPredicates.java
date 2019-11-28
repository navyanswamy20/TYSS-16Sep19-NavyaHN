package com.tyss.java8features;

import java.util.function.Predicate;

public class TestPredicates {
	public static void main(String[] args) {
		Predicate<Integer> p = i-> {
			if(i % 2==0) {
				return true;
			}else {
				return false;
			}
		};
		boolean res = p.test(101);
		System.out.println("result= "+res);
	}
}
