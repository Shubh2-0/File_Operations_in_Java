package com.masai;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterDemo {
	
	
	public static void main(String[] args)throws IOException {
	
	
//		OPEN FILE C.txt IN WRITE MODE
		Writer writer = new FileWriter("C.txt");
		
//		WRITE A SINGLE INTERGER VALUE
		writer.write(50);
		writer.write(48);
		writer.write(48);
		writer.write(48);
		writer.write("\n");
		writer.write("I AM PLACED SOON");
		writer.write("\n");
		char content[] = {'J','A','V','A'};
		writer.write(content);
		
		
		
		writer.flush();
		
		
		
		writer.close();
		
		writer = new FileWriter("C.txt",true);
		writer.write("\nThis is test file");
		writer.close();
		
		
		
	}

}
