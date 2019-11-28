package com.tyss.objectclass;

public class TestPersnoClone {
public static void main(String[] args) throws CloneNotSupportedException {
	PersonClone p1 = new PersonClone(12, "sharvari");
	System.out.println("person1 id is "+p1.id);
	System.out.println("person1 name is "+p1.name);
	Object o = p1.clone();
	PersonClone p2 = (PersonClone)o;
	System.out.println("person2 id is "+p2.id);
	System.out.println("person2 name is "+p2.name);
	
}
}
