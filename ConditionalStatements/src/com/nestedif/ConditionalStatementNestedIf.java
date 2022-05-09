package com.nestedif;

public class ConditionalStatementNestedIf {

	public static void main(String[] args) {
int age=19;
int weight=50;


if (age>18) {
	if (weight>48) {
	System.out.println("Your are eligible to donate blood");

	} else{  
        System.out.println("You are not eligible to donate blood");    
    }  
} else{  
  System.out.println("Age must be greater than 18");  

}
}
}