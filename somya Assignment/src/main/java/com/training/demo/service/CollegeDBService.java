package com.training.demo.service;

import java.util.List;

import com.training.demo.entities.College;
import com.training.demo.entities.Student;

public interface CollegeDBService {

	public List<College> getAllColleges();

	public College getCollege(Integer collegeId);

	public String addCollege(College college);

	public Student getStudent(Integer studentId);

	public String addStudent(Student student);

	public List<Student> getStudentById(Integer collegeId);

}
