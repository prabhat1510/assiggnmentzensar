package com.training.demo.service;

import java.util.List;

import com.training.demo.entities.Student;

public interface StudentService {
	public List<Student> getAllStudents();

	public Student getStudentById(Integer studentId);

	public String addStudent(Student student);
	public List<Student> getAllStudentsByCollegeId(Integer collegeId);
}