package com.tyss.objectclass;

public class TestStudentOver {
public static void main(String[] args) {
	StudentOver s = new StudentOver(10, "navya", 78.3);
	 s.toString();
	 System.out.println(s);
	 int h = s.hashCode();
	 System.out.println(h);
}
}
