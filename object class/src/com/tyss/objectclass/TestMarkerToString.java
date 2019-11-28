package com.tyss.objectclass;

public class TestMarkerToString {
public static void main(String[] args) {
	MarkerToString m = new  MarkerToString();
	int h = m.hashCode();
	String s = m.toString();
	System.out.println("hash code of m is "+h );
	System.out.println("string representation of m is "+s);
	}
}
