package com.training.demo.service;
import java.util.List;


import com.training.demo.entities.Student;

public interface StudentService {
	public List<Student> getAllstud();
	public Student getStudentById(Integer id);
	public String addStudent(Student student);
}