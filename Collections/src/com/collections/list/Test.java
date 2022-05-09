package com.collections.list;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add(10);
		arrayList.add(10.5);
		arrayList.add("durga");
		arrayList.add("rathan");
		arrayList.add(10);
		arrayList.add(null);
		
		arrayList.add(10);
		arrayList.add(30);
		arrayList.add(40);
		
		arrayList.add("name");
		arrayList.add("age");
		arrayList.add("age");
		
		


		System.out.println(arrayList);
		System.out.println(arrayList.size());
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40.f);
		
		System.out.println(al);
		
		
	ArrayList al1=new ArrayList();
	al1.add("name");
	al1.add("age");
	al1.add("salary");
		
		System.out.println(al1);
	

		/*
		 * arrayList.add(3, "anu"); // how to add data specifics
		 * System.out.println(arrayList); arrayList.remove(2); // how to remove based on
		 * index System.out.println(arrayList);
		 * 
		 * arrayList.remove("rathan"); System.out.println(arrayList);
		 * 
		 * arrayList.set(1, "XXX"); // how to replace the data
		 * System.out.println(arrayList);
		 * 
		 * System.out.println(arrayList.isEmpty()); // how to check empty or not
		 * 
		 * arrayList.clear(); // how to clear objects
		 * System.out.println(arrayList.isEmpty());
		 * 
		 * // ArrayList arrayList1=new ArrayList(); // arrayList1.add(10); //
		 * arrayList1.remove(10); // will get IndexOutOfBoundsException
		 * 
		 */	}

}
