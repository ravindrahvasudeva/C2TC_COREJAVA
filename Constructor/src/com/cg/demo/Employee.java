package com.cg.demo;

public class Employee {
	int id;
	String name;
	float salary;
	Employee() {
		System.out.println("user defined no-arguement"+"constructor excepted");
	}
	void display() {
		System.out.println(id + " " + name + " " + salary);
	}

}
