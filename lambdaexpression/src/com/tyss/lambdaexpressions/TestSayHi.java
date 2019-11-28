package com.tyss.lambdaexpressions;

public class TestSayHi {
	public static void main(String[] args) {
		

SayHiInterface say = () -> {
return "hi";

};
String sayyy = say.sayhi();

System.out.println("message is "+sayyy);
}
}