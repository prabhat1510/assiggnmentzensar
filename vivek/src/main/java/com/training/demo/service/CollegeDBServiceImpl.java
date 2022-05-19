package com.training.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.demo.entities.College;
import com.training.demo.entities.Student;
import com.training.demo.repository.StudentRepository;
import com.training.demo.repository.CollegeRepository;

@Service
public class CollegeDBServiceImpl implements CollegeDBService {

	@Autowired
	CollegeRepository collegeRepo;
	@Autowired
	StudentRepository studentRepo;

	@Override
	public College getCollege(Integer collegeId) {
		Optional<College> college = collegeRepo.findById(collegeId);
		if (college.isPresent()) {
			return college.get();
		} else {
			return null;
		}
	}

	@Override
	public List<Student> getStudentById(Integer collegeId) {
		List<Student> result = new ArrayList<Student>();
		Optional<Student> stud = studentRepo.findById(collegeId);
		if (!stud.isPresent()) {
			return null;
		} else {
			result.add(stud.get());
		}
		return result;
	}

	@Override
	public String addCollege(College college) {
		College col = collegeRepo.save(college);
		if (col != null) {
			return "College with id --" + col.getCollegeId() + " added successfully";
		} else {
			return "Unable to add college";
		}
	}

	@Override
	public Student getStudent(Integer studentId) {
		Optional<Student> student = studentRepo.findById(studentId);
		if (student.isPresent()) {
			return student.get();
		} else {
			return null;
		}

	}

	@Override
	public String addStudent(Student student) {
		Student stud = studentRepo.save(student);
		if (stud != null) {
			return "College with id --" + stud.getStudentId() + " added successfully";
		} else {
			return "Unable to add college";
		}
	}

	@Override
	public List<College> getAllColleges() {
		return (List<College>) collegeRepo.findAll();
	}

}
