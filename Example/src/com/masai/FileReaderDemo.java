package com.masai;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderDemo {
	
	public static void main(String[] args) throws IOException {
	
		
//	CREATE OBJECT OF FILE CLASS TO CAPTURE FILE A.txt
		
	File file = new File("A.txt");
	
	
	if(!file.exists()) {
		System.out.println("No file exixts named A.txt");
		return;
	}
	
//	YOU ARE HERE MEANS FILE A.txt ARE PRESENT
//	OPER FILE FOR READING
	Reader reader = new FileReader(file);
	
//	while(true) {
//	
//		int ch = reader.read();
//		
//		if(ch==-1)
//			break;
//		
//		System.out.print((char)ch);
//		
//	}
		
	reader.close();
	
	Reader reader2 = new FileReader(file);
	
	char[] arr = new char[(int)file.length()];
	 reader2.read(arr);
	 
	 System.out.println(new String(arr));
	 
	 reader2.close();
	
		
		System.out.println("\r\nhello");
	}

}
