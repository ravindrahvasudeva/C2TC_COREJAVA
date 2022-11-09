package com.cg.inheritanceconcept;
//When a class inherits another class, it is known as a single inheritance.

 class Animal {
	void eat()
	{
		System.out.println("eating..");
	}}
	class Dog extends Animal{
		void bark() {
			System.out.println("barking...");
		}
	}
	class Demo{
		public static void main(String args[]) {
			Dog d = new Dog();
			d.bark();
			d.eat();
			
		}
	}
