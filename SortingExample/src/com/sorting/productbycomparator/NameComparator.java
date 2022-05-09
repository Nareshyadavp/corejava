package com.sorting.productbycomparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
// By Ascending order
		return p1.name.compareTo(p2.name); // wherewere string data is there we have to used the comapreTo()
// Descending order
		// Two types change the descending order 
		// 1.return p1.name.compareTo(p2.name) //interchanged p1 replace to p2
		//2.return -p1.name.compareTo(p2.name) //by using -
	
	}

}
