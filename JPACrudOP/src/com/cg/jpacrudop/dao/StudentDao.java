package com.cg.jpacrudop.dao;

import com.cg.jpacrudop.entities.Student;

public interface StudentDao {

	    public abstract Student getStudentById(int id);
	    public abstract void addStudent(Student student);
	    public abstract void removeStudent(Student student);
	    public abstract void updateStudent(Student student);

	    public abstract void commitTransaction();
	    public abstract void beginTransaction();
	}