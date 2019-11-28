package com.tyss.collectionframework.list;

import java.util.ArrayList;

public class TestA {
	public static void main(String[] args) {


		ArrayList al = new ArrayList();
		al.add(12);
		al.add(22.3);
		al.add("navya");
		al.add(null);
		al.add(true);

		Object objat2 = al.get(2);
		System.out.println("object of 2 is " +objat2);

		for(int i=0;i<5;i++) {
			Object obj = al.get(i);
			System.out.println(obj);
		}
	}
}
