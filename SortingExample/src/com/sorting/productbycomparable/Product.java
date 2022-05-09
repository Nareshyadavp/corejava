package com.sorting.productbycomparable;

public class Product implements Comparable<Product> {
int id;
String name;
int cost;
public Product(int id, String name, int cost) {
	super();
	this.id = id;
	this.name = name;
	this.cost = cost;
}

/*
 * @Override public int compareTo(Product p) { // compareTo() is obj
 * 
 * return name.compareTo(name); //by using String compareTo() }
 */
@Override
public int compareTo(Product p1) {  // compareTo() is obj
Product p=p1;
if(id==p.id)
	return 0;
else if(id>p.id) return 1; else return -1;
	

}

}
