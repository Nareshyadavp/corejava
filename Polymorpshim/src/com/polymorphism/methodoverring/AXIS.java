package com.polymorphism.methodoverring;

class Bank {
	int getRateOfInterest() {
 		return 2;
	}
}

//Creating child classes.  
class SBI extends Bank {
	int getRateOfInterest()
	{
		System.out.println("SBI Rate of Interest: ");
		return 8;
	}
}

class ICICI extends Bank {
	int getRateOfInterest() {
		return 7;
	}
}

public class AXIS extends Bank {
	int getRateOfInterest() {
		return 9;
	}

	public static void main(String[] args) {
		AXIS a=new AXIS();
a.getRateOfInterest();
	SBI s=new SBI();  
	s.getRateOfInterest();
	ICICI i=new ICICI();  
	i.getRateOfInterest();
}
}
