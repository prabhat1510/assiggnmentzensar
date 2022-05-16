package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.College;
import com.example.demo.entities.Student;

public interface Studentservice {
	public String addcollegedata(College college);
	public College getcollegeid(Integer id);
	public String addstudentdata(Student student);
	public Student getstudentid(Integer id);
	public List<Student> getAllstudents(Integer id);

}
