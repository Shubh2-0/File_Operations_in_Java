package com.masai;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class HasADeslioazation {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
	ObjectInput oi = new ObjectInputStream(new FileInputStream("dog.ser"));
	
	Dog d = (Dog) oi.readObject();
	
	System.out.println(d.c.r.age);
	
	oi.close();
		
	}
	
}
