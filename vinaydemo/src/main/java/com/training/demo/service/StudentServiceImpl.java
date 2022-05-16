package com.training.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.demo.entity.Student;

import com.training.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
@Autowired
private StudentRepository studentRepository;


public Student saveStudent(Student student) {
	// TODO Auto-generated method stub
	return studentRepository.save(student);
}

@Override
public Student updateStudent(Student student) {
	// TODO Auto-generated method stub
	return studentRepository.save(student);
}

@Override
public List<Student> findAllStudents() {
	// TODO Auto-generated method stub
	return (List<Student>) studentRepository.findAll();
}

@Override
public Student saveStudent(StudentService student) {
	// TODO Auto-generated method stub
	return null;
}

}
