package com.sorting.productbycomparator;

import java.util.Collections; 
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList<Product>linkedList=new LinkedList<Product>();
		 linkedList.add(new Product(444,"pen",30));
		 linkedList.add(new Product(333,"fan",700));
		 linkedList.add(new Product(555,"chair",500));
		 linkedList.add(new Product(666,"book",50));
		 Collections.sort(linkedList,new IdComparator()); //sorting by IdComparator() applying
		 Collections.sort(linkedList,new NameComparator()); // sorting by NameComparator() applying

		 for (Product p:linkedList) {  // by using for loop
			 System.out.println("print data  Ascending order:"+p.id+" "+p.name+" "+p.cost); //print data  Ascending order
		 }

	}

}
