package com.treeset;

import java.util.SortedSet;
import java.util.TreeSet;

public class Launch {

	public static void main(String[] args) {
TreeSet<Integer>t=new TreeSet<Integer>();
for(int i=1;i<10;i++)
t.add(i);
System.out.println(t);

SortedSet<Integer> s=t.subSet(3, 7);//subset return type is sortedset

TreeSet<Integer>t1=new TreeSet<Integer>(s); //by constructor
System.out.println(t1);

SortedSet<Integer>ss=t.tailSet(4); //tailset return type is sortedset
TreeSet<Integer>t2=new TreeSet<Integer>(ss); //by constructor
System.out.println(t2);


SortedSet<Integer>s1=t.headSet(6);  //headset return type is sortedset
TreeSet<Integer>t3=new TreeSet<Integer>(s1); //by constructor
System.out.println(t3);
	}

}
