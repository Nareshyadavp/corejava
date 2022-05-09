package com.sorting.productbycomparator;

import java.util.Comparator;

public class IdComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		
	// By Ascending Oder
		if (p1.id == p2.id) // by using the integer data so we will get (==,>,<)
			return 0;
		else if(p1.id>p2.id)
			return 1;
		else 
			return -1;
		
	// By using the Descending order	
		/*
		 * if (p1.id == p2.id) // by using the integer data so we will get (==,>,<)
		 * return 0; else if(p1.id>p2.id) return 1; else return -1;
		 */
	}

}
