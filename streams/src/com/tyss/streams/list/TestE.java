package com.tyss.streams.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestE {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(20);
		al.add(10);
		al.add(93);
		al.add(32);
		al.add(45);
		al.add(35);
		al.add(75);

		List<Integer> l = al.stream().sorted().collect(Collectors.toList());
		Iterator<Integer> it = l.iterator();
		while(it.hasNext()){
			Integer i =it.next();
			System.out.println(i);
		};
	}
}
