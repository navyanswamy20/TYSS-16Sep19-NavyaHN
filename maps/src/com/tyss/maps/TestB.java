package com.tyss.maps;

import java.util.HashMap;

public class TestB {
public static void main(String[] args) {
	
	HashMap hm = new HashMap<>();
	hm.put("navya", 98745612);
	hm.put("sharu", 5698448);
	hm.put("kali", 91640330);
	
	HashMap hm1 = new HashMap<>();
	hm1.put("ibbi", 87626256);
	hm1.put("lalu",531256);
	hm1.put("mani", 879633);
	
	boolean haskey = hm.containsKey("kali");
	System.out.println("has key "+haskey);
	
	boolean haskey1 = hm.containsKey("kaliiii");
	System.out.println("has key "+haskey1);
	
	boolean hasval = hm.containsValue(91640330);
	System.out.println("has value "+hasval);
	
	boolean hasval1 = hm.containsValue(91640);
	System.out.println("has value "+hasval1);
	
	hm.putAll(hm1);
	System.out.println("after put all "+hm);
	
	System.out.println(hm.size());
	
	boolean isempty = hm.isEmpty();
	System.out.println("map is empty?"+isempty);
	
	hm.clear();
	System.out.println("after clear() "+hm);
	
	
}
}
