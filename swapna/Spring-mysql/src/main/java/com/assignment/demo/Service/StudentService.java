package com.assignment.demo.Service;

import java.util.List;

import com.assignment.demo.model.College;
import com.assignment.demo.model.Student;

public interface StudentService {
	
	public List<Student> getAllStudents();
	public String addStudent(Student student);
	public Student getStudentById(Integer id);
	public College getCollegeById(Integer id);

}