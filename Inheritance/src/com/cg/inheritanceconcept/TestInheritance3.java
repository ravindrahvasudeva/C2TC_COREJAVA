package com.cg.inheritanceconcept;
class Animal2 {
	void eat()
	{
		System.out.println("eating..");
	}
	}
	class Dog12 extends Animal2{
		void bark() {
			System.out.println("barking...");
		}
	}

	class Cat extends Dog12{
		void meow() {
			System.out.println("meowing ....");
		}
	}	
class TestInheritance3 {

	public static void main(String[] args) {
		Cat c = new Cat();
		c.meow();
		c.eat();

	}

}
