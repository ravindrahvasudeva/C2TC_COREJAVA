package com.cg.jpacrudop.services;
import com.cg.jpacrudop.dao.StudentDao;
import com.cg.jpacrudop.dao.StudentDaoImpl;
import com.cg.jpacrudop.entities.Student;
public class StudentServiceImpl implements StudentService {
    private StudentDao dao;
    public StudentServiceImpl() {

        dao = new StudentDaoImpl();
    }
    @Override
    public void addStudent(Student student) {
        dao.beginTransaction();
        dao.addStudent(student);
        dao.commitTransaction();
    }
    @Override
    public void updateStudent(Student student) {
        dao.beginTransaction();
        dao.updateStudent(student);
        dao.commitTransaction();
    }
    @Override
    public void removeStudent(Student student) {
        dao.beginTransaction();
        dao.removeStudent(student);
        dao.commitTransaction();
    }
    @Override
    public Student findStudentById(int id) {
        //no need of transaction, as it's an read operation
        Student student = dao.getStudentById(id);
        return student;
    }
}