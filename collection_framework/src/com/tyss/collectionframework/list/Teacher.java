package com.tyss.collectionframework.list;

public class Teacher {
	int tid;
	String name;
	double sal;
	String sub;
	public Teacher(int tid, String name, double sal,String sub) {
		super();
		this.tid = tid;
		this.name = name;
		this.sal = sal;
		this.sub = sub;
	}
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", name=" + name + ", sal=" + sal + " , sal=" + sal + "]";
	}
	public int getId() {
		return tid;
	}
	public void setId(int tid) {
		this.tid = tid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.name = sub;
	}

}
