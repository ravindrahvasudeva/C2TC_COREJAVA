package com.cg.thiskeyword;
//to invoke current class constructor (Contd…)
class hello
{
	hello(){
		this(5);
		System.out.println("hello a");
	}
	hello(int x)
	{
		System.out.println(x);
	}
}
public class Main {

	public static void main(String[] args) {
		hello a= new hello();
	
	}

}
