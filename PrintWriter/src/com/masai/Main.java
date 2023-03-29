package com.masai;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {
	
	PrintWriter pr = new PrintWriter("F.txt");
	ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,5,6,7,8,9));
	pr.println(100);
	pr.println(true);
	pr.println("Shubham");
	pr.println(list);
	pr.close();
	
		
	}

}
