package com.sorting.productbycomparable;

import java.util.Collections;
import java.util.LinkedList;

public class SortingByComparable {

	public static void main(String[] args) {
		LinkedList<Product> linkedList = new LinkedList<Product>();
		linkedList.add(new Product(444, "pen", 30));
		linkedList.add(new Product(333, "fan", 700));
		linkedList.add(new Product(555, "chair", 500));
		linkedList.add(new Product(666, "book", 50));
		Collections.sort(linkedList);
		for(Product p:linkedList) {
			System.out.println(p.id+" "+p.name+" "+p.cost);
		}
	}

}
