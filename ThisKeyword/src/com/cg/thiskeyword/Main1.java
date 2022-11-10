package com.cg.thiskeyword;
//Passed as argument in the method call
class S2
{
	void m(S2 a) {
		System.out.println("method is invoed");
	}
	void p() {
		m(this);
	}
}
public class Main1 {

	public static void main(String[] args) {
		S2 s1 = new S2();
		s1.p();
		

	}

}
