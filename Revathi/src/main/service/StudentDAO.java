package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.College;
import com.example.demo.entities.Student;
import com.example.demo.repository.Collegerepository;
import com.example.demo.repository.Studentrepository;

@Service
public class StudentDAO implements Studentservice {
	@Autowired
	Collegerepository repository;
	@Autowired
	Studentrepository repository1;

	@Override
	public String addcollegedata(College college) {
		College coll = repository.save(college);

		if (coll != null) {
			return "Student with id --" + coll.getCollegeid() + " added successfully";
		} else {
			return "Unable to add student";
		}
	}

	@Override
	public College getcollegeid(Integer id) {
		Optional<College> coll = repository.findById(id);
		if (coll.isPresent()) {
			return coll.get();
		} else {
			return null;
		}
	}

	@Override
	public String addstudentdata(Student student) {
		Student std = repository1.save(student);
		if (std != null) {
			return std.getClass() + "added ";
		} else {
			return "unable to add";
		}
	}

	@Override
	public Student getstudentid(Integer id) {
		Optional<Student> std = repository1.findById(id);
		if (std.isPresent()) {
			return std.get();
		} else {
			return null;
		}
	}

	@Override
	public List<Student> getAllstudents(Integer id) {

		return (List<Student>) repository1.findAll();
	}

}