
public class ConstructorOverloading {
String name;
int eid;
long adhar;
public  ConstructorOverloading(String name,int eid,long adhar) {
	this.name = name;
	this.eid = eid;
	this.adhar = adhar;
}
public  ConstructorOverloading(String name,int eid) {
	this.name = name;
	this.eid = eid;
}
void show() {
	System.out.println(name+ "," +eid+ "," +adhar);
}
public static void main(String[] args) {
	ConstructorOverloading con1 = new ConstructorOverloading("navya",100,123456789l);
	con1.show();
	ConstructorOverloading con2 = new ConstructorOverloading("sharvari",200,123469789l);
	con2.show();
	
	ConstructorOverloading con3 = new ConstructorOverloading("navya1",1001);
	con3.show();
	ConstructorOverloading con4 = new ConstructorOverloading("sharvari1",2001);
	con4.show();
	
	
}
}

