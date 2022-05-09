package com.clonening.serialization1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
	Employee emp=new Employee( "ram",111);
	void serializationDemo() throws IOException  {
		FileOutputStream fos=new FileOutputStream("abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(emp);
		oos.close();
		System.out.println("serialiaztion process is done.....");
	}
	void deserializable() throws IOException, ClassNotFoundException {
		FileInputStream fis =new FileInputStream("abc.txt");
		@SuppressWarnings("resource")
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee emp=(Employee)ois.readObject();
	System.out.println(emp.eid+" "+emp.ename);
		
	}
	
	 	 
		public static void main(String[] args) throws IOException, ClassNotFoundException {
Test t=new Test();
 t.serializationDemo();
 t.deserializable();
 }
}