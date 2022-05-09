package com.clonening.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainClass {

	void serializationDemo() throws IOException {
		Employee emp = new Employee(111, "rathan"); // write objct of employee
		FileOutputStream fos = new FileOutputStream("aaa,text");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
		oos.close();
		System.out.println("Serialization process is done");

	}

	public static void main(String[] args) throws IOException {
		MainClass mc = new MainClass();
		mc.serializationDemo();
	}

}
