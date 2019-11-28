package com.tyss.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestTeacher {

	public static void main(String[] args) {
		ArrayList<Teacher> al = new ArrayList<Teacher>();
		Teacher e1 = new Teacher(10, "navya", 20000,"maths");
		Teacher e2 = new Teacher(20, "kavya", 60000,"kannada");
		Teacher e3 = new Teacher(30, "divya", 32000,"english");
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		for(int i=0;i<al.size();i++) {
			Teacher e =al.get(i);
			System.out.println("id is "+e.tid);
			System.out.println("name is "+e.name);
			System.out.println("salary is "+e.sal);
			System.out.println("subject is "+e.sub);
		}
		
		System.out.println("---------for each------");
		
		for(Teacher e : al) {
			System.out.println(e);
		}
		
		System.out.println("---------thorugh iterator------");
		Iterator<Teacher> li = al.iterator();
		while(li.hasNext()) {
			Teacher s = li.next();
			System.out.println(s);
			}
	}
	}
