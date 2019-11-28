package com.tyss.typecasting.refence;

public class Marker extends Pen {
double size;
void color() {
	System.out.println("color method of marker class");
}
@Override
void write() {
	System.out.println("marker write method");
}
}
