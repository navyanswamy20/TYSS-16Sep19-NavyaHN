package com.tyss.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestM {
public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<>();
	al.add("mani");
	al.add("swamy");
	al.add("navya");
	al.add("sharu");
	
	
	System.out.println("before sort "+al);
	Collections.sort(al);
	System.out.println("after sort "+al);
			
	}
}
