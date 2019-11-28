package com.tyss.objectclass;

public class PersonClone implements Cloneable {
	int id;
	String name;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public PersonClone(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}
