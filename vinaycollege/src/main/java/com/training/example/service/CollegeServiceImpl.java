package com.training.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.example.entity.College;
import com.training.example.repository.CollegeRepository;


@Service
public class CollegeServiceImpl implements CollegeService {
	@Autowired
	private CollegeRepository collegeRepository;

	public College saveCollege(College college) {
		return collegeRepository.save(college);
	}

	@Override
	public College updateCollege(College college) {
		// TODO Auto-generated method stub
		return collegeRepository.save(college);
	}

	@Override
	public List<College> findAllColleges() {
		// TODO Auto-generated method stub
		
		return (List<College>) collegeRepository.findAll();
	}

	@Override
	public College saveCollege(CollegeService college) {
		// TODO Auto-generated method stub
		return null;
	}
	

}