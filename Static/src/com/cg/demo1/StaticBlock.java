package com.cg.demo1;
 class StaticBlock {
		   int rollno;
		   String name;
		   static String college ;
		   static {
			   college="SIET TUMKURU";
		   }
		   StaticBlock(int r,String n)
		   {
			   rollno=r;
			   name=n;
		   }
		   static void change() {
			   college ="SHRI DEVI INSTITUTE OF ENGINEERING AND TECHNOLOGY TUMKURU";
		   }
		   void display() {
			   System.out.println(rollno+" "+name+" "+college);
		   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlock sb1 = new StaticBlock(111,"ravi");
		StaticBlock sb2 = new StaticBlock(112,"sinra");
		sb1.display();
		change();
		sb2.display();

	}}


