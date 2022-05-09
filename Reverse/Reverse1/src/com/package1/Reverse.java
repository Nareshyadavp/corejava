package com.package1;

public class Reverse {

	public static void main(String[] args) {
 String n="naresh";
  char y[]=n.toCharArray();
  int size =y.length;
  char a[]=new char [size];
  int i=0;
  while (i!=size)
  {
	  a[size-1-i]=y[i];
	  i++;
	  System.out.print(y);
	  System.out.print(a);
 }
	}
 

}
