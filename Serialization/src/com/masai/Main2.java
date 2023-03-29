package com.masai;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Main2 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	
	
	ObjectInput oi = new ObjectInputStream(new FileInputStream("human.ser"));	
		
    Human human = (Human) oi.readObject();
	
	
    oi.close();		
		
    System.out.println(human);
    
	}
	
	
}
