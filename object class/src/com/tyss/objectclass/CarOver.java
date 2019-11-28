package com.tyss.objectclass;

public class CarOver {
int cost;
String brand;
String color;

public CarOver(int cost, String brand, String color) {
	super();
	this.cost = cost;
	this.brand = brand;
	this.color = color;
}

@Override
public int hashCode() {
	return cost;
}

@Override
public String toString() {
	return "CarOver [cost=" + cost + ", brand=" + brand + ", color=" + color + "]";
}




}
