package com.training.demo.service;

import com.training.demo.entities.College;

public interface CollegeService {

	public College getCollegeById(Integer studentId);

	public String addCollege(College college);
	
}
