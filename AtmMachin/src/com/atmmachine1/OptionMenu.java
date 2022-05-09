package com.atmmachine1;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

import com.sun.tools.doclint.Entity;

public class OptionMenu extends Account {
Scanner menuInput=new Scanner(System.in);
DecimalFormat moneyFormat=new DecimalFormat("$,###,##0.00");
HashMap<Integer,Integer>data=new HashMap<Integer,Integer>();

// validate Login information customer number and pin number//
public void getLogin() throws IOException{
	int x=1;
	do {
		try {
			data.put(9876543, 9876);
			data.put(8989898, 1890);
			System.out.println("Welcome to the ATM Project!");
			System.out.println("Enter Your Customer Number");
			setCustomerNumber(menuInput.nextInt());
			System.out.println("Enter Your Pin Number");
			setCustomerNumber(menuInput.nextInt());
			
		}
	catch (Exception.e) {
		System.out.println("/n"+"Invalid Character(s).only Numbers."+"/n");
	x=2;
	for(Entity<Integer,Integer> entity:data.entrySet()) {
		getAccountType();
		
	}
	
}
		System.out.println("/n"+"Wrong Customer Number or Pin Number."+"/n");

	}while (x==1);
	
}
// Display Account Type Menu with selection//
public void getAccountType() {
	System.out.println("Select the Account want to access");
System.out.println("Type 1- Checking Account");
System.out.println("Type 2-Saving Account");
System.out.println("Type 3-Exit");
System.out.print("Choice:");

 selection = menuInput.next();
switch (selection) {
case1;
getChecking();
break;
case2;
getSaving();
break;
case3;
System.out.println("Thank You for usig this ATM,bye");
break;
default;
System.out.println("/n"+"Invaild Choice"+"/n");
getAccountType();
}
}

// Display Account Type Menu with selection//
System.out.println("Checking Account");
System.out.println("Type 1- view Balance");
System.out.println("Type 2-Withdraw Funds");
System.out.println("Type 3-Deposit Funds");
System.out.println("Type 4-Exit");
System.out.print("Choice:");


selection =menuInput.nextInt();
switch (selection) {
System.out.println("Cheking Accout Balance:"+MemoryFormat.format);
}

}
}
private void setCustomerNumber(int nextInt) {
	
}
}
