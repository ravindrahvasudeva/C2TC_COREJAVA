package com.cg.thiskeyword;
//‘this’ is a reference variable that refers to the current object
public class Demo {
	void m() {
		System.out.println(this);
	}

	public static void main(String[] args) {
		Demo objc =new Demo();
		System.out.println(objc);
		objc.m();

	}

}
