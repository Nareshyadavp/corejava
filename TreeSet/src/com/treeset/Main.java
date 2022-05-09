package com.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		TreeSet<Product>ts=new TreeSet<Product>(new Mycomp2());
		ts.add(new Product(111,"chair",110));
		ts.add(new Product(333,"pen",220));
		ts.add(new Product(888,"bottle",330));
		for (Product p:ts)
		{
			System.out.println(p.id+" "+p.name+" "+p.cost);
		}
	}

}
class Mycomp2 implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		return -p1.name.compareTo(p2.name); //decending the order names will get it 
	}
	
}