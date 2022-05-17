package com.training.demo.repository;


import java.util.List;


import com.training.demo.entities.Student;

public interface StudentDAO {
	public List<Student> getAllstud();
	public Student getStudentById(Integer id);
	public String addStudent(Student student);
}