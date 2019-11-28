package com.tyss.maps;

import java.util.HashMap;

public class TestA {
public static void main(String[] args) {
	HashMap hm = new HashMap<>();
	hm.put("navya", 98745612);
	hm.put("sharu", 5698448);
	hm.put("kali", 91640330);
	hm.put("ibbi", 87626256);
	//hm.put(null, 8529631);	only one null value is allowed.
	hm.put(null, 8529633);
	
	System.out.println("data "+hm);
	hm.put("ibbi", 1259643);
	System.out.println("after modify "+hm);
	hm.put("mani", 91640330);
	System.out.println("after mani "+hm);
	
	System.out.println("after null "+hm);
	
	Object name = hm.get("kali");	//returns the value of the corresponding key
	System.out.println(name);
	
	Object name1 = hm.get("kaliiii");	//returns the null.
	System.out.println(name1);
	
	Object removed = hm.remove("kali");
	System.out.println(removed);
	
	Object removed1 = hm.remove("kaliiiiii");
	System.out.println(removed1);
	
	
	
	
	
	
	
}
}
