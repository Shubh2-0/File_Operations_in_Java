package com.masai;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;


public class CustomerMain2 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
	ObjectInput oi = new ObjectInputStream(new FileInputStream("customer.ser"));
	
	Customer cr = (Customer) oi.readObject();
	
	System.out.println(cr);
	
		
	}

}
