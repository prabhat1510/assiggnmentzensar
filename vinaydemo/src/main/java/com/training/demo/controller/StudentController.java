package com.training.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.demo.entity.Student;
import com.training.demo.service.StudentServiceImpl;


@RestController
@CrossOrigin("*")
public class StudentController {
	
@Autowired
private StudentServiceImpl studentServiceImpl;
@PostMapping(value="saveStudent")
public Student saveStudent(@RequestBody Student student) {

	studentServiceImpl.saveStudent(student);
	return student;	
}
}
