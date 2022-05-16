package com.assignment.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.demo.Repository.CollegeRepository;
import com.assignment.demo.Repository.StudentRepository;
import com.assignment.demo.model.College;
import com.assignment.demo.model.Student;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository repository;

	@Override
	public List<Student> getAllstud() {
		return (List<Student>) repository.findAll();
	}

	@Override
	public Student getStudentById(Integer id) {
		Optional<Student> student = repository.findById(id);
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
			return "student with id --" + stud.getstudentId() + " added successfully";
		} else {
			return "Unable to add student";
		}
	}

	
}
