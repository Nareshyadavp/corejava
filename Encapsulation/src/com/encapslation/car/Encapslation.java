package com.encapslation.car;

public class Encapslation {

	public static void main(String[] args) {
 Car car=new Car("Toofan", 3000000, "200kmph");
 
 System.out.println("name:"+car.getName());
 System.out.println("price:"+car.getPrice());
 System.out.println("topSpeed:"+car.getTopSpeed());
	}

}
