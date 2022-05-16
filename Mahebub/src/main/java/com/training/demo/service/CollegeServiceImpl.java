package com.training.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.demo.entities.College;
import com.training.demo.repository.CollegeRepository;

@Service
public class CollegeServiceImpl implements CollegeService {

	@Autowired
	CollegeRepository repository;

	@Override
	public College getCollegeById(Integer collegeId) {
		Optional<College> college = repository.findById(collegeId);
		if (college.isPresent()) {
			return college.get();
		} else {
			return null;
		}

	}

	@Override
	public String addCollege(College college) {
		College colg = repository.save(college);
		if (colg != null) {
			return "College with id --" + colg.getCollegeId() + " added successfully";
		} else {
			return "Unable to add College";
		}
	}

}
