package com.tyss.springcore.di;

public class Human implements Animal {
	@Override
	public void makeSound() {
		System.out.println("bla bla bla bla");
	}
}
