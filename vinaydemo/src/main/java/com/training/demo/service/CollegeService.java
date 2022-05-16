package com.training.demo.service;

import java.util.List;

import com.training.demo.entity.College;

public interface CollegeService {

	//to save new college
public College saveCollege(CollegeService college);

//tp update college
public College updateCollege(College college);
 
//to fetch all colleges from database
public List<College> findAllColleges();

}
