package com.cursor.listiterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterators {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Name");
		arrayList.add("Age");
		arrayList.add("EmpNo");
		arrayList.add("CompanyName");

		// ListIterator cursor:generics version:print the data forward version
		ListIterator<String> lst = arrayList.listIterator();
		while (lst.hasNext()) {
			System.out.println(lst);
		}

		// ListIterator cursor:generics version:print the data previous version
		ListIterator<String> lst1 = arrayList.listIterator();
		while (lst1.hasPrevious()) {
			System.out.println(lst1);
		}

		System.out.println("operations are completed");
	}

}