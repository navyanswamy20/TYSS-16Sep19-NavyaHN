package com.tyss.objectclass;
public class RemotecreateObjects {
void add() {
	System.out.println("add() method");	
}
public static void main(String[] args) throws InstantiationException, IllegalAccessException {
	RemotecreateObjects r = new RemotecreateObjects();
Class c = r. getClass();
Object o = c.newInstance();
RemotecreateObjects q = (RemotecreateObjects)o;
q.add();

}
}
