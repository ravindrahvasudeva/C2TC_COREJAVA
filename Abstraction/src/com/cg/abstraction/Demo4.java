package com.cg.abstraction;

abstract class Bank{
	abstract void roi();
}
class SBI extends Bank{
	void roi() {
		System.out.println("Something");
	}
}
class Axix extends Bank{
	void roi() {
		System.out.println("Some");
	}
}


public class Demo4 {

	public static void main(String[] args) {
		SBI b = new SBI();
	    Axix a = new Axix();
	    b.roi();
	    a.roi();

	}

}


