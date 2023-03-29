package com.masai;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedDemo {

	public static void main(String[] args) throws IOException {
	
		File file = new File("D.txt");
		
		Reader reader = new FileReader(file);
		
		BufferedReader br = new BufferedReader(reader);
	
		while(true) {
	
		String str = br.readLine();
		if(str==null) break;
			
			System.out.println(str);
		
			
			
			
		}
		
		br.close();
		
		
		
		
	}
	
}
