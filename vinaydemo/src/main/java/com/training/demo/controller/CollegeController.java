package com.training.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.training.demo.entity.College;

import com.training.demo.service.CollegeServiceImpl;


@RestController
@CrossOrigin("*")
public class CollegeController {
	
@Autowired
private CollegeServiceImpl collegeServiceImpl;
@PostMapping(value="saveCollege")
public College saveCollege(@RequestBody College college) {
	collegeServiceImpl.saveCollege(college);
	return college;	
}
}
