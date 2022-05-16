package com.training.demo.service;

import java.util.List;

import com.training.demo.entities.College;
import com.training.demo.entities.Student;

public interface StudentService {
	public List<Student> getAllStudents();
	public String addStudent(Student student);
	public Student getStudentById(Integer id);
	public College getCollegeById(Integer id);

}

