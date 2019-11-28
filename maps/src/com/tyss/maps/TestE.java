package com.tyss.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestE {
	public static void main(String[] args) {
		TreeMap<String, Integer> lh = new TreeMap<>();
		lh.put("shimoga", 566432);
		lh.put("bangalore", 560068);
		lh.put("thirtalli", 560036);
		//lh.put(null, 560836);	null is not allowed
		
		System.out.println(lh);
		
		for(Map.Entry<String, Integer> m : lh.entrySet()) {
			String key = m.getKey();
			Integer val = m.getValue();
			System.out.println("key is "+key);
			System.out.println("value is "+val);
		}
}
}
