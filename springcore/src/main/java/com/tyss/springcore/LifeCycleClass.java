package com.tyss.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcore.di.Hello;

public class LifeCycleClass {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	Hello hello = context.getBean(Hello.class);
	System.out.println(hello.getMsg());
	context.close();
	
}
}
