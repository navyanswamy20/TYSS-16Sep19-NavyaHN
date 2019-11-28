package com.tyss.sorting.list;

public class Laptop implements Comparable<Laptop> {
double price;
int ram;
String name;
public Laptop(double price, int ram, String name) {
	super();
	this.price = price;
	this.ram = ram;
	this.name = name;
}

////sorting with ram
//@Override
//public int compareTo(Laptop l) {
//	
//	//invalid use only with wrapper class not with primitives
//	//int i = this.id;
//	//int j = s.id;
//	
//	Integer i = this.ram;
//	Integer j = l.ram;
//	return i.compareTo(j);
//}
//sort with price
//@Override
//public int compareTo(Laptop l) {
//	
//	Double i = this.price;
//	Double j = l.price;
//	return i.compareTo(j);
//}

//sort with name
@Override
public int compareTo(Laptop l) {
	
	String i = this.name;
	String j = l.name;
	return i.compareTo(j);
}
}
