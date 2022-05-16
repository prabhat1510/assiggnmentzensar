package com.training.shubhamcollege.service;

import com.training.shubhamcollege.entities.College;

public interface CollegeService {

	public College getCollegeById(Integer studentId);

	public String addCollege(College college);
	
}