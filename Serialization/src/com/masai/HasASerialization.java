package com.masai;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Rat implements Serializable{
	
	int age = 1;
}


class Cat implements Serializable{
	
	Rat r = new Rat();
	
}

class Dog implements Serializable{
	
	Cat c = new Cat();
	
}


public class HasASerialization {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Dog d = new Dog();
		
		ObjectOutput oo = new ObjectOutputStream(new FileOutputStream("dog.ser"));
		
		oo.writeObject(d);
	
		oo.close();
		
		
	}

}
