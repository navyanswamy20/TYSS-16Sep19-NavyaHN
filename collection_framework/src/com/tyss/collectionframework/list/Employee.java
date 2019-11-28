package com.tyss.collectionframework.list;

public class Employee {
	int eid;
	String name;
	double sal;
	public Employee(int eid, String name, double sal) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Student [eid=" + eid + ", name=" + name + ", sal=" + sal + "]";
	}
	public int getId() {
		return eid;
	}
	public void setId(int eid) {
		this.eid = eid;
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

}
