package com.clonening.deserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainClass {
	
void serializationDemo() throws IOException {
	Employee1 emp1= new Employee1(111,"rathan");  //write objct of employee
	FileOutputStream fos=new FileOutputStream("aaa,text");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(emp1);
	oos.close();
	System.out.println("Serialization process is done");
	
}
void deserialization() throws IOException, ClassNotFoundException {
	FileInputStream fis=new FileInputStream("aa,text");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Employee1 emp1=(Employee1)ois.readObject();
	System.out.println(emp1.id+" "+emp1.name);
	ois.close();
	
}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		MainClass mc=new MainClass();
		mc.serializationDemo();
		mc.deserialization();
	}

}
