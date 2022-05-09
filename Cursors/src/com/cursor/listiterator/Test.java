package com.cursor.listiterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		ArrayList<Book> book = new ArrayList<Book>();
		book.add(new Book(111, "java", "rathan"));

		book.add(new Book(222, "c", "anu"));

		book.add(new Book(333, "c++", "durga"));

		Iterator<Book> itr = book.iterator();
		while (itr.hasNext()) {
			Book b = itr.next();
			if (b.id == 111)
				itr.remove();//remove
			if (b.name.equals("c++"))
				itr.remove();
			
			 
  			}
		
		// print the reaming the data
		for (Book b : book) {

			System.out.println(b.id+" "+b.name+" "+b.author);
		}
	}

}
