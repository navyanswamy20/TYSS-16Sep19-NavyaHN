package com.tyss.objectclass;

public class TestClone {
public static void main(String[] args) throws CloneNotSupportedException {
	PersonClone p1 = new PersonClone(23, "sharu");
	System.out.println("person1 id  " +p1.id);
	System.out.println("person1 id " +p1.name);
	
	Object o = p1.clone();
	PersonClone p2 = new PersonClone(298, "sharuuu");
	System.out.println("person2 id " +p2.id);
	System.out.println("person2 id " +p2.name);
	
}
}
