package com.masai;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class CustomerMain {

	public static void main(String[] args) throws FileNotFoundException, IOException {
	
	Customer customer = new Customer("Shuvansh", LocalDate.now(), "Banglore", 6232133182L);

	
	ObjectOutput oo = new ObjectOutputStream(new FileOutputStream("customer.ser"));
	
	oo.writeObject(customer);
	
	
	oo.close();
	
	
	System.out.println("Customer Serialized");
		
	}
	
	
}
