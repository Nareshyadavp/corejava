package com.vectors;

import java.util.Iterator;
import java.util.Vector;

public class RemoveByVector {

	public static void main(String[] args) {
Vector<Integer> vector =new Vector<Integer>();
for(int i=1;i<30;i++) {
	vector.add(i);	
}
	System.out.println(vector);
	
	//remove the odd elements by using the iterator cursor
	Iterator<Integer> it=vector.iterator();
	while (it.hasNext()) {  //cheking the objcts
Integer integer=it.next();//read the method
if(integer%2==0)
 System.out.println(integer);	// even printed 
else 
	it.remove(); 
	}
	System.out.println(vector);  //even printed
	}

}
