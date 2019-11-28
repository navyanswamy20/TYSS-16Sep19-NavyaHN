package com.tyss.immutableclass;

public class TestString {
public static void main(String[] args) {
	MyString ms = new MyString(12,"navya");
	System.out.println(ms.getName());
	System.out.println(ms.getRollno());
	System.out.println(ms);
	
MyString ms1 =	ms.changeContent(23, "sharu");
	System.out.println(ms.getName());
	System.out.println(ms.getRollno());
	System.out.println("------------------------------------");
	System.out.println(ms1.getName());
	System.out.println(ms1.getRollno());
	
}
}
