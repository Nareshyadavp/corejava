package com.encapsulation.dao;

import java.util.List;

import com.encapsulation.model.Student;

public class StudentDao {
	private static List<Student> studentList = null;
	static {

		Student s = new Student();
		s.setId(1);
		s.setFirstName("java");
		s.setLastName("express");
		s.setAge(30);

		Student s2 = new Student();
		s2.setId(1);
		s2.setFirstName("ram");
		s2.setLastName("durga");
		s2.setAge(28);
		

	}

}
