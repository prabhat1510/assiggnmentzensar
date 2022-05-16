package com.training.demo.service;

import java.util.List;


import com.training.demo.entity.Student;

public interface StudentService {

	//to save new student
public Student saveStudent(StudentService student);

//tp update student
public Student updateStudent(Student student);
 
//to fetch all student from database
public List<Student> findAllStudents();

}
