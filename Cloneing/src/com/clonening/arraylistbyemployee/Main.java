package com.clonening.arraylistbyemployee;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(111, "rathan"));
		al.add(new Employee(222, "raj"));
		al.add(new Employee(333, "thammudu")); //incase of hetrogeneous also everyobjt must implements serialiazable

		// serialization of arraylist :Writing objects
		FileOutputStream fos = new FileOutputStream("aaa,text");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(al);
		oos.close();
		System.out.println("Serialization process is done");
		
		// Deserialization of arraylist :reading objects
	FileInputStream fis=new FileInputStream("aaa,text");
	ObjectInputStream ois=new ObjectInputStream(fis);
ArrayList<Employee> deal= (ArrayList<Employee>) ois.readObject(); //reading the data
for(Employee e:deal) {
	System.out.println(e.id+" "+e.name);
	ois.close();
}
	}

}
