package com.filehanding;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//	 File f=new File("word.txt");
		FileInputStream fis=new FileInputStream("C:\\Users\\nareshpa\\abc.java");  //read
		FileOutputStream fos=new FileOutputStream("xyz.txt"); //write

		int c;
		while ((c=fis.read())!=-1) {   // endof stream using  (-1)
		System.out.println((char)c);
			fos.write(c); 
			
		}fis.close();
		fos.close();
			
			}

		}
	


