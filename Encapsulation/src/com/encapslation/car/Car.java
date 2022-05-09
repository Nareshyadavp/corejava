package com.encapslation.car;

public class Car {
private String name;
private int price;
private String topSpeed;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getTopSpeed() {
	return topSpeed;
}
public void setTopSpeed(String topSpeed) {
	this.topSpeed = topSpeed;
}
public Car(String name, int price, String topSpeed) {
	super();
	this.name = name;
	this.price = price;
	this.topSpeed = topSpeed;
}
 
}
