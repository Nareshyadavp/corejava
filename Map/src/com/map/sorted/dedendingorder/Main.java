package com.map.sorted.dedendingorder;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		TreeMap<Product,Integer>tm= new TreeMap<Product,Integer>( new MyComp());//apply in construtor 
		tm.put(new Product(111,"annu"), 1);
		tm.put(new Product(333,"rathan"), 2);
		tm.put(new Product(444,"ramu"), 3);
		tm.put(new Product(888,"ram"), 4);
 Set<Product> s=tm.keySet();
 for(Product p:s) {
	 System.out.println(p.id+" "+p.name);
 }
	}
}

class MyComp implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		return -p1.id.compareTo(p2.id);
	}
}
