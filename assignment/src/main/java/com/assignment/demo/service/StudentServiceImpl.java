package com.assignment.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.demo.entities.College;
import com.assignment.demo.entities.Student;
import com.assignment.demo.repository.CollegeRepository;
import com.assignment.demo.repository.StudentRepository;



@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository repository;
	@Autowired
	CollegeRepository collegerepository;
	public List<Student> getAllStudents() {
		return (List<Student>) repository.findAll();
	}

	
public Student getStudentById(Integer id) {
		Optional<Student> student = repository.findById(id);
		if (student.isPresent()) {
			return student.get();
		} else {
			return null;
		}	}

	public String addStudent(Student student) {
		Student stu = repository.save(student);
		
		if (stu != null) {
			return "Student with id --" + ((Student) stu).getStudentId() + " added successfully";
		} else {
			return "Unable to add student";
		}	}


	public College getCollegeById(Integer id) {
		Optional<College> college = collegerepository.findById(id);
		if(college.isPresent()) {
			return college.get();
		} else {
			return null;
		}
	}

	

}
