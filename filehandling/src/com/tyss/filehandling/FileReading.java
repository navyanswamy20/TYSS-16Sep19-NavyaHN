package com.tyss.filehandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReading {
	public static void main(String[] args) {
		String path = "C:\\Users\\lenovo\\Desktop\\text.txt.txt";
		FileReader reader = null;
		try {
			reader = new FileReader(path);

//			int i1 = reader.read();
//			char ch1 = (char) i1;
//			System.out.print(ch1);
			
			int i;
			while((i=reader.read())!= -1) {
				System.out.print((char)i);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}//end of FileReading
