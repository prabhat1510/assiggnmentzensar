package com.training.demo.repository;

import java.util.List;

import com.training.demo.entities.College;
import com.training.demo.entities.Student;

public interface CollegeDBDAO {

	public College getCollege(Integer collegeId);

	public String addCollege(College college);

	public Student getStudent(Integer studentId);

	public String addStudent(Student student);

	public List<Student> getStudentById(Integer collegeId);

}
