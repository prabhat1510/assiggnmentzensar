package com.training.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.college.demo.entities.College;
import com.college.demo.entities.Student;
import com.college.demo.repository.CollegeRepository;
import com.college.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository repository;
	
	@Autowired
	CollegeRepository clg_repository;

	@Override
	public List<Student> getAllStudents() {
		return (List<Student>) repository.findAll();
	}

	public String addStudent(Student student) {
		Student stud = repository.save(student);

		if(stud != null) {
			return "Student with id --"+stud.getStudentId()+" added successfully";
		}else {
			return "Unable to add student";
		}
	}
	
	public Student getStudentById(Integer id) {
		Optional<Student> stud = repository.findById(id);
		if(stud.isPresent()) {
			return stud.get();
		} else {
			return null;
		}
	}
	
	
	public College getCollegeById(Integer id) {
		Optional<College> college = clg_repository.findById(id);
		if(college.isPresent()) {
			return college.get();
		} else {
			return null;
		}
	}

}
