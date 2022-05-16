package com.training.demo.controller;

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

import com.training.demo.entities.College;
import com.training.demo.entities.Student;
import com.training.demo.service.CollegeDBService;

@Controller
public class CollegeDBController {

	@Autowired
	CollegeDBService collegeService;

	// get College by ID
	// URL - http://localhost:4431/college/
	@GetMapping("/college/{id}")
	public ModelAndView getCollege(@PathVariable Integer id) {

		College col = collegeService.getCollege(id);
		Map<String, College> model = new HashMap<String, College>();

		model.put("college", col);

		ModelAndView modelAndView = new ModelAndView("collegedetails", model);
		return modelAndView;
	}

	// get Student by ID
	// URL - http://localhost:4431/student/
	@GetMapping("/student/{id}")
	public ModelAndView getStudent(@PathVariable Integer id) {

		Student stud = collegeService.getStudent(id);
		Map<String, Student> model = new HashMap<String, Student>();

		model.put("student", stud);

		ModelAndView modelAndView = new ModelAndView("studentdetails", model);
		return modelAndView;
	}

	// get Student by CollegeID
	// URL - http://localhost:4431/studentbycollegeid/
	@GetMapping("/studentbycollegeid/{id}")
	public ModelAndView getStudentByCollegeId(@PathVariable Integer id) {
		List<Student> stud = collegeService.getStudentById(id);
		Map<String, List<Student>> model = new HashMap<String, List<Student>>();
		model.put("student", stud);
		ModelAndView modelAndView = new ModelAndView("studentdetails", model);
		return modelAndView ;
	}
	
	// URL- http://localhost:4431/addcollege --- Using post man send data in Request
	// Body of http request
	@RequestMapping(value = "/addcollege", method = RequestMethod.POST)
	public ModelAndView addCollege(@RequestBody College college) {

		String message = collegeService.addCollege(college);
		Map<String, String> model = new HashMap<String, String>();
		model.put("message", message);
		ModelAndView modelAndView = new ModelAndView("success", model);
		return modelAndView;
	}

	// URL- http://localhost:4431/addstudent --- Using post man send data in Request
	// Body of http request
	@RequestMapping(value = "/addstudent", method = RequestMethod.POST)
	public ModelAndView addStudent(@RequestBody Student student) {

		String message = collegeService.addStudent(student);
		Map<String, String> model = new HashMap<String, String>();
		model.put("message", message);
		ModelAndView modelAndView = new ModelAndView("successstudent", model);
		return modelAndView;
	}
}
