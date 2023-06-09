package com.masai;

import java.io.File;

public class FileDirDemo {
	public static void main(String[] args) {
	
		File file = new File("MyDir");
		
		if(!file.exists()) {
			
			System.out.println("No Directory name MyDir");
			return;
		}
		
		System.out.println("MyDir is a directory : "+file.isDirectory());
		String[] list = file.list();
		
		for(String n : list)
			System.out.println(n);
		
		
		File Dir2 = new File("MyDir2");
		
     if(!Dir2.exists()) {
    	 
    	 System.out.println("No folder is found : "+Dir2.getName());
    	 
    	 Dir2.mkdir();
    	 
     }
     try {
		Thread.sleep(6000);
    	 Dir2.delete();
    	 
	} catch (Exception e) {
		
		
	}
		
	}

}
