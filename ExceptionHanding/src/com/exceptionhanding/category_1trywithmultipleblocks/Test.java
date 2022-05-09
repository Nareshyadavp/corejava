package com.exceptionhanding.category_1trywithmultipleblocks;


//case-1 Active 
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
 try {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the number");
	int num=scan.nextInt();
System.out.println(10/num);               //AE
System.out.println("rathan".charAt(10));  //SIOBE
}
catch (ArithmeticException ar) {
	System.out.println("rathan.com");
	
}
 catch ( StringIndexOutOfBoundsException e) {
		System.out.println("ramu.com");
		
	}
 
System.out.println("rest of the application");
	}

}
