package com.masai;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
	
	Human human = new Human("Rajan", 23, 66.25);
	
	ObjectOutput oo = new ObjectOutputStream(new FileOutputStream("human.ser"));
	oo.writeObject(human);
	
	oo.close();
	
	
		
		
		
	}

}
