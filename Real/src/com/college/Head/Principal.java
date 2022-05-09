package com.college.Head;

import java.util.ArrayList;

import com.college.drivers.Drivers;
import com.college.nontech.NonTeachers;
import com.college.student.Students;
import com.college.teachers.Teachers;

public class Principal {

	public static void main(String[] args) {
Students student1 =new Students(101, "Ram", 6, "1stclass");
Students student2 =new Students(102, "raj", 7, "2stclass");
Students student3 =new Students(103, "ramana", 8, "3stclass");
Students student4 =new Students(104, "ramakrishnana", 9, "4stclass");
Students student5 =new Students(105, "ramraj", 10, "5stclass");
Students student6 =new Students(106, "ravana", 11, "6stclass");




Teachers teacher1=new Teachers(1001, "suresh", 25);
Teachers teacher2=new Teachers(1002, "praveen", 26);
Teachers teacher3=new Teachers(1003, "naveen", 27);
Teachers teacher4=new Teachers(1004, "jamal", 28);
Teachers teacher5=new Teachers(1005, "suri", 29);

Drivers driver1=new Drivers(2001, "lakshman", 33);
Drivers driver2=new Drivers(2002, "javed", 44);
Drivers driver3=new Drivers(2003, "abhu", 38);




NonTeachers worker=new NonTeachers(3001, "paavan", 36);
NonTeachers worker1=new NonTeachers(3001, "raj", 37);
NonTeachers worker2=new NonTeachers(3001, "thammudu", 39);

/*
ArrayList<Students>arrayList=new ArrayList<Students>();
arrayList.add(student1);
arrayList.add(student2);
arrayList.add(student3);


ArrayList<Students>arrayList1=new ArrayList<Students>();
arrayList1.addAll(arrayList);
arrayList1.add(student4);
arrayList1.add(student5);
arrayList1.add(student6);


for (Students s:arrayList1) {
	System.out.println(s.id+" "+s.name+" "+s.age+" "+s.nameOfClass);
*/


ArrayList<Teachers>arrayList=new ArrayList<Teachers>();
arrayList.add(teacher1);
arrayList.add(teacher2);
arrayList.add(teacher3);
arrayList.add(teacher4);

ArrayList<Teachers>arrayList1=new ArrayList<Teachers>();
arrayList1.addAll(arrayList);
arrayList1.add(teacher4);
arrayList1.add(teacher5);
/*
 * System.out.println(arrayList1.contains(teacher1));
 * System.out.println(arrayList1.containsAll(arrayList));
 * System.out.println(arrayList1.removeAll(arrayList));
 * System.out.println(arrayList1.containsAll(arrayList));
 * 
 * 
 * arrayList1.addAll(arrayList); System.out.println(arrayList1)
 */;
for (Teachers t:arrayList1) {
	System.out.println(t.id+" "+t.name+" "+t.age);
}




ArrayList<NonTeachers> array=new ArrayList<NonTeachers>();
array.add(worker);
ArrayList<NonTeachers> array1=new ArrayList<NonTeachers>();
array1.addAll(array);
array1.add(worker1);
array1.add(worker2);

for (NonTeachers nt:array1) {
	System.out.println(nt.id+" "+nt.name+" "+nt.age);
}




	ArrayList<Drivers> array2=new ArrayList<Drivers>();
	array2.add(driver1);
	array2.add(driver2);
	ArrayList<Drivers> array3=new ArrayList<Drivers>();
	array3.addAll(array2);
	array3.add(driver3);
	for (Drivers d:array3) {
		System.out.println(d.id+" "+d.name+" "+d.age);
	}

	}



	
	
	
	
	}


