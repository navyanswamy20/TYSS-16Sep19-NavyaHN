package com.tyss.lambdaexpressions;

public class TestFactorial {
public static void main(String[] args) {
	FactorialInterface factint = (a) -> {
	int fact = 1;
	for(int i = 2;i<=a;i++) {
		fact = fact*i;
	}
	return fact;
	};
	int factTotal = factint.fact(5);
	System.out.println("factorial of num is = " +factTotal);
}
}
