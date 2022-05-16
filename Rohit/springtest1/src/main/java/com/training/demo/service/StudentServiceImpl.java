package com.training.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.demo.entities.Student;
import com.training.demo.repository.StudentRepository;



@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepository repository;

	@Override
	public List<Student> getAllStudents() {
		return (List<Student>) repository.findAll();
	}

	@Override
	public String addstudent(Student student) {
		Student stud=repository.save(student);
		if(stud!=null)
		{
			return "student Added successfully s"+stud.getStudentId();
		}
		else {
			return"ERROR! while adding Student";
		}
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

}
