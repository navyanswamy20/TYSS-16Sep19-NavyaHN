package com.tyss.collectionframework.list;

import java.util.ArrayList;

public class TestB {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(10);
	al.add(29.3);
	al.add(true);
	al.add("navya");
	for(Object o : al) {
		System.out.println(o);
	}
	

}
}
