package com.tyss.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestC {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<>();
		lh.put("bangalore", 560068);
		lh.put("shimoga", 566432);
		lh.put("thirtalli", 560036);

		System.out.println(lh);

		Set<String> s = lh.keySet();
		for(String key : s) {
			System.out.println("key is "+key);
		}

		Collection<Integer> c = lh.values();
		for(Integer value : c) {
			System.out.println("values are "+value);
		}
	}
}
