package com.tyss.studentapp.qspiders;

//import com.tyss.studentapp.jspiders.Angular;
//import com.tyss.studentapp.jspiders.React;
import com.tyss.studentapp.jspiders.*;

public class TestA {
	public static void main(String[] args) {
		QTP q = new QTP();
		q.teachQTP();	
		Selenium s =new Selenium();
		s.teachSelenium();
		
	//By using fully qualified class name	
//	com.tyss.studentapp.jspiders.Angular a1 = new com.tyss.studentapp.jspiders.Angular();
//	com.tyss.studentapp.jspiders.Angular a2 = new com.tyss.studentapp.jspiders.Angular();
	
		//using import statement
		Angular a = new Angular();
		a.teachAngular();
		
		React r = new React();
		r.teachReact();
		
	}

}
