package com.tyss.objectclass;

public class StudentOver {
int id;
String name;
double percentage;
public StudentOver(int id, String name, double percentage) {
	super();
	this.id = id;
	this.name = name;
	this.percentage = percentage;
}

@Override
public int hashCode() {
	return id;
	
}

@Override
public String toString() {
	return "StudentOver [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
}


}


