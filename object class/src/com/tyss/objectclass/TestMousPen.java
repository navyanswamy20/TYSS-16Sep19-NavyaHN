package com.tyss.objectclass;

public class TestMousPen {
public static void main(String[] args) {
	Mouse m = new Mouse();
	USBPort.connect(m);
	Pendrive p = new Pendrive();
	USBPort.connect(p);
	
}

}
