package com.cg.abstraction;

abstract class Bike1{
	Bike1()
	{
		System.out.println("bike");
	}
	abstract void run1();
	void changeGear() {
		System.out.println("gear changed");
	}
}
class Honda1 extends Bike1{
	void run1() {
		System.out.println("running safe");
	}
}

public class Constructors {

	public static void main(String[] args) {
		Honda1 h =new Honda1();
		h.run1();
		h.changeGear();
	}

}
