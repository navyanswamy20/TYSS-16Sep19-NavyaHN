package com.tyss.filehandling;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesFileReader {
public static void main(String[] args) {
	String path = "text.properties";
	FileReader reader = null;
	try {
		reader = new FileReader(path);
		Properties prop = new Properties();
		prop.load(reader);
		String name = prop.getProperty("name");
		String company = prop.getProperty("company");
		String program = prop.getProperty("program");
		
		System.out.println("name	: "+name);
		System.out.println("company	: "+company);
		System.out.println("program	: "+program);

		
	} catch (Exception e) {
		e.printStackTrace();
	}

}
}
