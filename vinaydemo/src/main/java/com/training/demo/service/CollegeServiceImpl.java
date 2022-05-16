package com.training.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.demo.entity.College;
import com.training.demo.repository.CollegeRepository;



@Service
public class CollegeServiceImpl implements CollegeService {
@Autowired
private CollegeRepository collegeRepository;

public College saveCollege(College college) {
	// TODO Auto-generated method stub
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
	