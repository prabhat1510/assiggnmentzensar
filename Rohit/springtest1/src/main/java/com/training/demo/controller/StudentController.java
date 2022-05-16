package com.training.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.demo.entities.Student;
import com.training.demo.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService studentservice;

	// URL - http://localhost:9090/students
	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public ModelAndView getstudents() {
		List<Student> students =  studentservice.getAllStudents();
		Map<String, List<Student>> model = new HashMap<String, List<Student>>();

		model.put("allStudents", students);

		ModelAndView modelAndView = new ModelAndView("studentinfo", model);
		return modelAndView;
	}



	//http://localhost:9090/addstudent
	@RequestMapping(value = "/addstudent", method = RequestMethod.POST)
	public ModelAndView addStudent(@RequestBody Student student) {

		String message = studentservice.addstudent(student);
		Map<String, String> model = new HashMap<String, String>();
		model.put("message", message);
		ModelAndView modelAndView = new ModelAndView("success", model);
		return modelAndView;
	}


	//http://localhost:9090/studentform
	@GetMapping("/studentform")
	public ModelAndView getStudentAndCollegeForm(@ModelAttribute Student student) {
		ModelAndView modelAndView = new ModelAndView("studentform");
		return modelAndView;
	}

	
	@RequestMapping(value = "/savestudent", method = RequestMethod.POST)
	public String saveStudent(@ModelAttribute Student student) {

		String message = studentservice.addstudent(student);
		Map<String, String> model = new HashMap<String, String>();
		model.put("message", message);
		ModelAndView modelAndView = new ModelAndView("success", model);
		return "redirect:/students";
	}
	
	
	
	//http://localhost:9090/student/2
	@GetMapping("/student/{id}")
	public ModelAndView getStudentById(@PathVariable Integer id) {
		
		Student stud = studentservice.getStudentById(id);
		Map<String, Student> model = new HashMap<String, Student>();

		model.put("student", stud);

		ModelAndView modelAndView = new ModelAndView("studentdetails", model);
		return modelAndView;
	}



}
