package com.masai;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) throws FileNotFoundException {
	
	Scanner sc = new Scanner(new FileInputStream("student.txt"));	
	String name = sc.next();
	int std = sc.nextInt();
	double marks = sc.nextDouble();
	boolean nandicap = sc.nextBoolean();
	String cityState = sc.nextLine();
	
	System.out.println(name);
	System.out.println(std);
	System.out.println(nandicap);
	System.out.println(cityState);
	System.out.println(marks);
			
	
	
	sc.close();
		
	}

}
