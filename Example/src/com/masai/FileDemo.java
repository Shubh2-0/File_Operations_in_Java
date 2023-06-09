package com.masai;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		
//	CREATE OBJECT OF FILE CLASS
		
		File file = new File("A.txt");
		File file2 = new File("B.txt");
		File file3 = new File("C.txt");
		
//		CHECK IF FILE A.TXT EXISTS OR NOT
		if(!file.exists()) {
			System.out.println("No file named A.txt");
			return;
		}
		
//		HERE MEANS FILE ID PRESENT
		System.out.println("File Name : "+file.getName());
		System.out.println("Path of file : "+file.getPath());
		System.out.println("Absolute Path : "+file.getAbsolutePath());
	
		System.out.println(file2.exists());
		System.out.println("file2 is Directory(Folder) "+file2.isDirectory());
		System.out.println("fil2 is File type :"+file2.isFile());
		System.out.println("Character are present in the file :"+file2.length());
		
		
		if(!file3.exists()) {
			System.out.println("NO FILE FOUND WITH NAME C.txt");
		}
		System.out.println("Creating File");
		
	try {
		
		file3.createNewFile();
		System.out.println("File Create Successfully");
		Thread.sleep(5000);
	} catch (Exception e) {
		
		
	}
	file3.delete();
	
	}
	

}
