package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entities.College;
import com.example.demo.entities.Student;
import com.example.demo.service.Studentservice;

@Controller
public class Studentcontroller {
	@Autowired
	Studentservice studentservice;

	@RequestMapping(value = "/addcollege", method = RequestMethod.POST)
	public ModelAndView addcollegedata(@RequestBody College college) {

		String message = studentservice.addcollegedata(college);
		Map<String, String> model = new HashMap<String, String>();
		model.put("message", message);
		ModelAndView modelAndView = new ModelAndView("success", model);
		return modelAndView;
	}

	@GetMapping("/getcollege/{id}")
	public ModelAndView getCollegeById(@PathVariable Integer id) {
		College college = studentservice.getcollegeid(id);
		Map<String, College> model = new HashMap<String, College>();
		model.put("college", college);

		ModelAndView modelAndView = new ModelAndView("collegedetail", model);
		return modelAndView;
	}

	@RequestMapping(value = "/addstudent", method = RequestMethod.POST)
	public ModelAndView addStudent(@RequestBody Student student) {

		String message = studentservice.addstudentdata(student);
		Map<String, String> model = new HashMap<String, String>();
		model.put("message", message);
		ModelAndView modelAndView = new ModelAndView("success", model);
		return modelAndView;
	}

	@GetMapping("/getstudent/{id}")
	public ModelAndView getStudentById(@PathVariable Integer id) {
		Student stud = studentservice.getstudentid(id);
		Map<String, Student> model = new HashMap<String, Student>();
		model.put("student", stud);

		ModelAndView modelAndView = new ModelAndView("studentdetail", model);
		return modelAndView;
	}
}
