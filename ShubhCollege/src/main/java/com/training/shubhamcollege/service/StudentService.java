package com.training.shubhamcollege.service;


import java.util.List;
import com.training.shubhamcollege.entities.Student;

public interface StudentService {
	public List<Student> getAllStudents();
	public Student getStudentById(Integer studentId);
	public String addStudent(Student student);
	public List<Student> getAllStudentsByCollegeId(Integer collegeId);
}