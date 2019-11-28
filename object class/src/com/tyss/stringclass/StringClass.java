package com.tyss.stringclass;

public class StringClass {
public static void main(String[] args) {
	String s1 = "navya";
	String s2 = "sharu";
	
	String s3 = new String("navya");
	String s4 = new String("navya");
	String s5 = "navya";
	
	System.out.println(s1.equals(s2));
	System.out.println(s3.equals( s4));
	System.out.println(s1.equals(s5));
	
	String s6 = s1.toLowerCase();
	System.out.println(s6);
	String s7 = s2.toUpperCase();
	System.out.println(s7);
	char c = s1.charAt(0);
	System.out.println(c);
	boolean b = s1.equalsIgnoreCase("navYA") ;
	System.out.println(b);
	
	System.out.println("-----------------------------------");
	StringBuffer sb1 = new StringBuffer("khaleel");
	sb1.append("Navya");
	System.out.println(sb1);
	
	System.out.println("-----------------------------------");
	
	
	
}
}
