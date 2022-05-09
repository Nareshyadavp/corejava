package com.collections.list;

import java.util.ArrayList;

public class AddingOneCollectionToAnotherCollection {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);   // add() is used to only one object
// Approach-1 :constructor : only one collection to another
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>(arrayList);
		arrayList1.add(100);

		System.out.println(arrayList1);

		
		// Approach-2:addAll(): to add more than one collection to another
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		arrayList2.add(1000);
		ArrayList<Integer> arrayList3 = new ArrayList<Integer>();
		arrayList3.add(2000);
		ArrayList<Integer> arrayList4 = new ArrayList<Integer>();
		arrayList4.add(3000);                   //how to add the arrayList2,arrayList3 into arrayList4
		arrayList4.addAll(arrayList2);    // by using addAll();is used to one collection data into another collection
		arrayList4.addAll(arrayList3);     
		System.out.println(arrayList4);    
	}

}
