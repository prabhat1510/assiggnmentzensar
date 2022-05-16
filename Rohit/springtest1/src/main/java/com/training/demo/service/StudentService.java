package com.training.demo.service;

import java.util.List;

import com.training.demo.entities.Student;



public interface StudentService {
	public List<Student> getAllStudents();

	public String addstudent(Student student);

	public Student getStudentById(Integer id);

}
