package com.abstracted;

public class Student extends Person {

	private int studentId;

	public Student(String name, String gender, int studentId) {
		super(name, gender);
		this.studentId = studentId;
	}

	@Override
	public void studying() {

		if (studentId == 0) {
			System.out.println("not studying");
		}

		else {
			System.out.println("persuring a degree in bachelor");
		}

	}

	public static void main(String[] args) {
		Person student = new Student("priya", "female", 2);

		Person student1 = new Student("suri", "male", 3);

		Person student2 = new Student("lakshmi", "female", 4);
		Person student3 = new Student("mani", "male", 5);

		student.studying();
		student1.studying();
		student2.studying();
		student3.studying();

	}

}
