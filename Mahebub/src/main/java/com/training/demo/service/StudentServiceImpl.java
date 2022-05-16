package com.training.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.demo.entities.Student;
import com.training.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository repository;

	@Override
	public List<Student> getAllStudents() {
		return (List<Student>) repository.findAll();
	}

	@Override
	public Student getStudentById(Integer studentId) {
		Optional<Student> student = repository.findById(studentId);
		if (student.isPresent()) {
			return student.get();
		} else {
			return null;
		}

	}

	@Override
	public String addStudent(Student student) {
		Student stud = repository.save(student);
		if (stud != null) {
			return "Student with id --" + stud.getStudentId() + " added successfully";
		} else {
			return "Unable to add Student";
		}
	}

	@Override
	public List<Student> getAllStudentsByCollegeId(Integer collegeId) {
		return (List<Student>) repository.findAllStudentByCollegeId(collegeId);
	}

}