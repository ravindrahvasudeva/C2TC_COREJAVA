package com.cg.thiskeyword;
//Used to refer current class instance variable
class Student {
	   int rollno;
	   String name;
	   float fee;
	   Student(int rollno,  String  name,float fee)
	   {
		   this.rollno=rollno;
		   this.name=name;
		   this.fee=fee;
		  
	   }
	   void display() {
		   System.out.println(rollno+" "+name+" "+fee);
	   }}
public class TestThis2 {

	public static void main(String[] args) {
		Student s1 =new Student(111,"ravi",5000f);
		Student s2= new Student(112,"sinra",6000f);
		s1.display();
		s2.display();
	}
		

	}


