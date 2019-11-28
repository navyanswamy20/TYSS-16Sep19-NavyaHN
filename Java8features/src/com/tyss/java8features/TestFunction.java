package com.tyss.java8features;

import java.util.function.Function;

public class TestFunction {
public static void main(String[] args) {
	
	Function<Integer, Integer> f = i -> i * i;
	
	int res = f.apply(5);
	System.out.println(res);
	
	int res1 = f.apply(3);
	System.out.println(res1);
}
}
