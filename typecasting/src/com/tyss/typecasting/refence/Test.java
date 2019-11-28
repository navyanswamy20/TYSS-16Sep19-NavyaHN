package com.tyss.typecasting.refence;

public class Test {
public static void main(String[] args) {
	Pen p =new Marker();	//upcasting
	System.out.println(p.cost);
	p.write();
//	System.out.println(p.size);
//	p.coclor()
	Marker m = (Marker) p;	//Downcasting
	
	System.out.println(m.size);
	System.out.println(m.cost);
	m.color();
	m.write();
	

	}
}
