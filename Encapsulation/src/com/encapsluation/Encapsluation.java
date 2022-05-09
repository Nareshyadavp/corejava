package com.encapsluation;

public class Encapsluation {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("naresh");
		employee.setSalary(10000);

		System.out.println("id:" + employee.getId());
		System.out.println("name:" + employee.getName());
		System.out.println("salary:" + employee.getSalary());
	}

}
