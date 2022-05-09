package com.linkedlist.book;

import java.util.LinkedList;
import java.util.ListIterator;

public class Launch {

	public static void main(String[] args) {
		LinkedList<Book> linkedList = new LinkedList<Book>();

		linkedList.add(new Book(111, "java", "rathan"));
		linkedList.add(new Book(222, "c", "naresh"));
		linkedList.add(new Book(333, "python", "raj"));
		
		//by using the ListIterator
				ListIterator<Book> lst = linkedList.listIterator();
				while (lst.hasNext()) { // checking data
					Book book = lst.next(); // reading data
					if (book.name.equals("c")) 
					lst.remove();
				}
				//for each loop
				for (Book b : linkedList) {
					System.out.println(b.id + " " + b.name + " " + b.author);
			}
	}

}
