package com.assignment.demo.service;

import java.util.List;

import com.assignment.demo.entities.College;
import com.assignment.demo.entities.Student;



public interface StudentService {
	public List<Student> getAllStudents();
	public Student getStudentById(Integer id);
	public String addStudent(Student student);
	
	public College getCollegeById(Integer id);
}
