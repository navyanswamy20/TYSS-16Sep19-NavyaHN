package com.tyss.streams.list;

import java.util.ArrayList;
import java.util.Comparator;

public class TestD {
	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(20);
		marks.add(10);
		marks.add(93);
		marks.add(32);
		marks.add(45);
		marks.add(35);
		marks.add(75);

		Comparator<Integer> cmp = (m1,m2)-> {
			if(m1>m2) {
				return 1;
			}
			else if(m1<m2) {
				return -1;
			}else {
				return 0;
			}
		};
		long noOffailedstudents = marks.stream().filter(i -> i<40).count();

		System.out.println(noOffailedstudents);

		System.out.println("-------------------------");
		Integer i = marks.stream().min(cmp).get();
		System.out.println("main value is "+i);

		System.out.println("-------------------------");
		Integer j = marks.stream().max(cmp).get();
		System.out.println("maax value is "+j);

	}
}