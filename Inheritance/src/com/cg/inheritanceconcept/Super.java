package com.cg.inheritanceconcept;

class Animal11{
	String color ="white";
}
class Dog11 extends Animal11{
	String color ="black";
	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
}

public class Super {

	public static void main(String[] args) {
		Dog11 d=new Dog11();
		d.printColor();
		

	}

}
