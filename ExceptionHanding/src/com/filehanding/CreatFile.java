package com.filehanding;

import java.io.File;
import java.io.IOException;

public class CreatFile {
	

	public static void main(String[] args) {

		try {
			File myObj =new File("C\\FileHanding\\Filef1.txt");
			if (myObj.createNewFile()) {
				System.out.println("File created: "+myObj.getName());
			}
				else {
				System.out.println("File already exists");	
				}
				
			
		}
		catch(IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
			
		}
	}

}
