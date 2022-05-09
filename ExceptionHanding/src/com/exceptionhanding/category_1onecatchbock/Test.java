package com.exceptionhanding.category_1onecatchbock;

import java.util.Scanner;

// irrespective of exception write into only one catch block

//case-2lazy

public class Test {

	public static void main(String[] args) {
 try {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the number");
	int num=scan.nextInt();
System.out.println(10/num);               //AE
System.out.println("rathan".charAt(10));  //SIOBE
}
catch (Exception e) {  //can handle any type of exception
	System.out.println("rathan.com"+e);	
	
} 
 System.out.println("rest of the application");
}
}