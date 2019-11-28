package com.tyss.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestD {
public static void main(String[] args) {
	LinkedHashMap<String, Integer> lh = new LinkedHashMap<>();
	lh.put("bangalore", 560068);
	lh.put("shimoga", 566432);
	lh.put("thirtalli", 560036);
	
	for(Map.Entry<String, Integer> m : lh.entrySet()) {
		String key = m.getKey();
		Integer value = m.getValue();
		System.out.println("key is " + key +"-----" + "value is " + value);
	}
}
}
