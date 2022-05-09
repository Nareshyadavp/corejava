package com.vectors;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {

		Vector<Product> product = new Vector<Product>();

		product.add(new Product(111, "pen", 20));

		product.add(new Product(222, "fan", 20000));

		product.add(new Product(333, "light", 200));

//print the data by using enumeration 
		Enumeration<Product> em = product.elements(); // by using the elements()
		while (em.hasMoreElements()) { // checking data
			Product p = em.nextElement();// read the nextElement()
			System.out.println("Print the data");
			System.out.println(p.id + " " + p.name + " " + p.cost);
		}
		// print the data by using iterator
		Iterator<Product> it = product.iterator(); // by using the iterator()
		while (it.hasNext()) { // checking data
			Product p1 = it.next();// reading the data
			System.out.println(p1.id + " " + p1.name + "" + p1.cost); // printing
			System.out.println("befor remove");
			if (p1.id == 111)
				it.remove();
		}
		// print the data by using the ListIterator
		ListIterator<Product> lst = product.listIterator(); // by using ListIterator
		while (lst.hasNext()) { // checking data
			Product p2 = lst.next();// reading data

			if (p2.id == 222)
				lst.remove();
			System.out.println(p2.id + " " + p2.name + " " + p2.cost);// printing
		}

	}

}
