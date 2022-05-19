package com.training.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.demo.entities.Student;
import com.training.demo.service.StudentService;

/**
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CompanyController {
	//URL - http://localhost:8080/greet
	@RequestMapping(value ="/greet", method= RequestMethod.GET)
	public String greetings() {
		return "Hello Everyone Accept greetings from company class";
	}
	
}**/

@Controller
public class StudentController {
	@Autowired
	StudentService studentService;
	
	//URL - http://localhost:8080/greet
	@RequestMapping(value ="/greet", method= RequestMethod.GET)
	public ModelAndView greetings() {
		Map<String, String> model = new HashMap<String, String>();
		model.put("greetMsg",  "Hello Everyone Accept greetings from company class");
		
		ModelAndView modelAndView = new ModelAndView("greeting",model);
		return modelAndView;
	}
	
	//URL - http://localhost:8080/companies
	@RequestMapping(value ="/student", method= RequestMethod.GET)
	public ModelAndView getStudent() {
		List<Student> student = studentService.getAllstud();
		Map<String, List<Student>> model = new HashMap<String, List<Student>>();
	
		model.put("allStudent", student );
		
		ModelAndView modelAndView = new ModelAndView("studentinfo",model);
		return modelAndView;
	}
}