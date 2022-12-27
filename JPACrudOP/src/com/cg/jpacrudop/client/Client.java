package com.cg.jpacrudop.client;
import com.cg.jpacrudop.entities.Student;
import com.cg.jpacrudop.services.StudentServiceImpl;
import com.cg.jpacrudop.services.StudentService;
public class Client {
	
	    public static void main(String[] args) {
	        //Debug this program as Debug -> Debug as Java Application

	        StudentService service = new StudentServiceImpl();

	        Student student = new Student();
	        // Create Operation
	        student.setStudentId(147);
	        student.setName("Ravindra");
	        service.addStudent(student);

	        //at this breakpoint, we have added one record to table
	        // Retrieve Operation
	        student = service.findStudentById(147);
	        System.out.print("ID:" + student.getStudentId());
	        System.out.println(" Name:" + student.getName());
	        // Update Operation
	        student = service.findStudentById(147);
	        student.setName("Ravindra");
	        service.updateStudent(student);

	        //at this breakpoint, we have updated record added in first section

	        student = service.findStudentById(147);
	        System.out.print("ID:" + student.getStudentId());
	        System.out.println(" Name:" + student.getName());

	        //at this breakpoint, record is removed from table
	        // Delete Operation
	        student = service.findStudentById(147);
	        //service.removeStudent(student);
	        System.out.println("End of program/Life cycle completed...");

	    }
	}