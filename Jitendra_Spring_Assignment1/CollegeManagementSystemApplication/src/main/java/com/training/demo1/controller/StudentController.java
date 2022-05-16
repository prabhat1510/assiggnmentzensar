package com.training.demo1.controller;

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

import com.college.demo.entities.College;
import com.college.demo.entities.Student;
import com.college.demo.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService studentService;

	// Adding Student
	@RequestMapping(value = "/addstudent", method = RequestMethod.POST)
	public ModelAndView addStudent(@RequestBody Student student) {

		String message = studentService.addStudent(student);
		Map<String, String> model = new HashMap<String, String>();
		model.put("message", message);
		ModelAndView modelAndView = new ModelAndView("success", model);
		return modelAndView;
	}
	
	// Getting All Students
	@RequestMapping(value="/getallstudents", method = RequestMethod.GET)
	public ModelAndView getAllStudents() {
		List<Student> students = studentService.getAllStudents();
		
		Map<String, List<Student>> model = new HashMap<String, List<Student>>();
		model.put("allStudents", students);
		
		ModelAndView modelAndView = new ModelAndView("studentinfo", model);
		return modelAndView;
		
	}
	
	
	// Getting Student By Id
	@GetMapping("/getstudent/{id}")
	public ModelAndView getStudentById(@PathVariable Integer id)
	{
		Student stud = studentService.getStudentById(id);
		Map<String, Student> model = new HashMap<String, Student>();
		model.put("student", stud);
		
		ModelAndView modelAndView = new ModelAndView("studentdetail", model);
		return modelAndView;
	}
	
	
	@GetMapping("/getcollege/{id}")
	public ModelAndView getCollegeById(@PathVariable Integer id)
	{
		College college = studentService.getCollegeById(id);
		Map<String, College> model = new HashMap<String, College>();
		model.put("college", college);
		
		ModelAndView modelAndView = new ModelAndView("collegedetail", model);
		return modelAndView;
	}
}
