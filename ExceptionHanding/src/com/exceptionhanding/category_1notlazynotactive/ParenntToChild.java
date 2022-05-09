package com.exceptionhanding.category_1notlazynotactive;

// case-2 parent to child
import java.util.Scanner;

public class ParenntToChild {

		public static void main(String[] args) {

			try {
				Scanner scan =new Scanner(System.in);
				System.out.println("Enter the number");
				int num=scan.nextInt();
			System.out.println(10/num);               //AE
			System.out.println("rathan".charAt(10));  //SIOBE
			}
			
			// parent to child 
			catch (Exception e) {  //can handle any type of exception
				System.out.println("rathan.com"+e);	
				
			} 

		//	catch(ArithmeticException ae) {
				System.out.println("ramu");
			//}
						 System.out.println("rest of the application");
			}

	}


