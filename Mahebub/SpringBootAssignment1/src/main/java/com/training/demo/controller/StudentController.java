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

import com.training.demo.entities.College;
import com.training.demo.entities.Student;
import com.training.demo.service.CollegeService;
import com.training.demo.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService studentService;
	@Autowired
	CollegeService collegeService;

	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public ModelAndView getStudents() {
		List<Student> students = studentService.getAllStudents();
		Map<String, List<Student>> model = new HashMap<String, List<Student>>();

		model.put("allStudents", students);

		ModelAndView modelAndView = new ModelAndView("studentinfo", model);
		return modelAndView;
	}

	@RequestMapping(value = "/addstudent", method = RequestMethod.POST)
	public ModelAndView addStudent(@RequestBody Student student) {

		String message = studentService.addStudent(student);
		Map<String, String> model = new HashMap<String, String>();
		model.put("message", message);
		ModelAndView modelAndView = new ModelAndView("success", model);
		return modelAndView;
	}

	@RequestMapping(value = "/savestudent", method = RequestMethod.POST)
	public ModelAndView saveStudent(@ModelAttribute Student student) {

		String message = studentService.addStudent(student);
		Map<String, String> model = new HashMap<String, String>();
		model.put("message", message);
		ModelAndView modelAndView = new ModelAndView("success", model);
		return modelAndView;
	}

	@GetMapping("/student/{studentId}")
	public ModelAndView getStudentById(@PathVariable Integer studentId) {

		Student stud = studentService.getStudentById(studentId);
		Map<String, Student> model = new HashMap<String, Student>();

		model.put("student", stud);

		ModelAndView modelAndView = new ModelAndView("studentdetail", model);
		return modelAndView;
	}

	@RequestMapping(value = "/addcollege", method = RequestMethod.POST)
	public ModelAndView addCollege(@RequestBody College college) {

		String message = collegeService.addCollege(college);
		Map<String, String> model = new HashMap<String, String>();
		model.put("message1", message);
		ModelAndView modelAndView = new ModelAndView("success", model);
		return modelAndView;
	}

	@RequestMapping(value = "/savecollege", method = RequestMethod.POST)
	public ModelAndView saveCollege(@ModelAttribute College college) {

		String message = collegeService.addCollege(college);
		Map<String, String> model = new HashMap<String, String>();
		model.put("message1", message);
		ModelAndView modelAndView = new ModelAndView("success", model);
		return modelAndView;
	}

	@GetMapping("/college/{collegeId}")
	public ModelAndView getCollegeById(@PathVariable Integer collegeId) {

		College colg = collegeService.getCollegeById(collegeId);
		Map<String, College> model = new HashMap<String, College>();

		model.put("college", colg);

		ModelAndView modelAndView = new ModelAndView("collegedetail", model);
		return modelAndView;
	}

	@GetMapping("/getstudentsbycollegeid/{collegeId}")
	public ModelAndView getAllStudentsByCollegeId(@PathVariable Integer collegeId) {
		
		List<Student> students = studentService.getAllStudentsByCollegeId(collegeId);
		Map<String, List<Student>> model = new HashMap<String, List<Student>>();

		model.put("allStudents", students);

		ModelAndView modelAndView = new ModelAndView("studentinfo2", model);
		return modelAndView;
	}

}