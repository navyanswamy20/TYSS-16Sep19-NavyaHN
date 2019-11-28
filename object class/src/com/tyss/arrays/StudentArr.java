package com.tyss.arrays;

public class StudentArr {
int id;
String name;
double percentage;
public StudentArr(int id, String name, double percentage) {
	super();
	this.id = id;
	this.name = name;
	this.percentage = percentage;
}
@Override
public String toString() {
	return "StudentArr [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
}

}
