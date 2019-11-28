package com.tyss.maps;

import java.util.Hashtable;

public class TestG {
	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(101, "ajay");
		ht.put(102, "navya");
		ht.put(103, "sona");
		ht.put(104, "moni");
		ht.put(101, "ram");
		ht.put(109, "ram");
		//ht.put(null, "rama");  NullPointerException
		//ht.put(105, null);	NullPointerException
		System.out.println("data "+ht);
	}

}
