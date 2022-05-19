package com.assignment.demo.controller;

import java.awt.List;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.assignment.demo.entities.College;
import com.assignment.demo.entities.Student;
import com.assignment.demo.service.StudentService;


@Controller
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	
	// Getting All Students
	@RequestMapping(value = "/getallstudents", method = RequestMethod.GET)
	public ModelAndView getAllStudents() {
		List<Student> students = studentService.getAllStudents();
		Map<String, List<Student>> model = new HashMap<String, List<Student>>();

		model.put("allStudents", students);

		ModelAndView modelAndView = new ModelAndView("companyinfo", model);
		return modelAndView;
	}
	// Getting Student By Id
		@GetMapping("/getstudent/{id}")
		public ModelAndView getStudentById(@PathVariable Integer id) {
			Student stu = studentService.getStudentById(id);
			Map<String, Student> model = new HashMap<String, Student>();
			model.put("student", stu);
			
			ModelAndView modelAndView = new ModelAndView("studentdetail", model);
			return modelAndView;
		}
	
	// URL- http://localhost:8080/addstudent --- Using post man send data in Request
		// Body of http request
		@RequestMapping(value = "/addstudent", method = RequestMethod.POST)
		public ModelAndView addStudent(@RequestBody Student student) {

			String message = studentService.addStudent(student);
			Map<String, String> model = new HashMap<String, String>();
			model.put("message", message);
			ModelAndView modelAndView = new ModelAndView("success", model);
			return modelAndView;
		}
		@GetMapping("/getcollege/{id}")
		public ModelAndView getCollegeById(@PathVariable Integer id) {
			College college = studentService.getCollegeById(id);
			Map<String, College> model = new HashMap<String, College>();
			model.put("college", college);
			
			ModelAndView modelAndView = new ModelAndView("collegedetail", model);
			return modelAndView;
		}
}
