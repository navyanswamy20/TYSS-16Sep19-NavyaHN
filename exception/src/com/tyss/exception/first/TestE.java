package com.tyss.exception.first;

public class TestE {
	public static void main(String[] args) {
		System.out.println("main started");

		String s = "heloo";	//String s = null; Null

		int []a = {10,20,30};
		int b = 10;
		try {
			String s1 = s.toUpperCase();
			System.out.println(s1);
			System.out.println(a[6]);
			System.out.println(b/0);

		}catch(Exception e) {
			e.printStackTrace();
		}


		System.out.println("main ended");
	}
}
