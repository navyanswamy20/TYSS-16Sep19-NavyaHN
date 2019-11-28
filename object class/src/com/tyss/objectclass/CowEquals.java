package com.tyss.objectclass;

public class CowEquals {
int id;
String name;
double cost;
public CowEquals(int id, String name, double cost) {
	super();
	this.id = id;
	this.name = name;
	this.cost = cost;
}


public boolean equals(Object obj) {
	CowEquals c = (CowEquals)obj;
	if(this.id== c.id) {
		if(this.name.equals(c.name)) {
			if(this.cost == c.cost) {
				return true;
			}
			else {
				return false;
			}
		}
			else {
				return false;
			}
	}
			else {
				return false;
			}
		}

}
