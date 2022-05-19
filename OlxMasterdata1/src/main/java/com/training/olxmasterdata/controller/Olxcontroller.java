package com.training.olxmasterdata.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.training.olxmasterdata.entities.Category;
import com.training.olxmasterdata.service.CategoryService;

/**
 * import org.springframework.web.bind.annotation.RestController;
 * 
 * @RestController public class CompanyController { //URL -
 *                 http://localhost:8080/greet
 * @RequestMapping(value ="/greet", method= RequestMethod.GET) public String
 *                       greetings() { return "Hello Everyone Accept greetings
 *                       from company class"; }
 * 
 *                       }
 **/

@RestController
public class Olxcontroller {
	@Autowired
	CategoryService  categoryService;

	// URL - http://localhost:8080/greet
	@RequestMapping(value = "/greet", method = RequestMethod.GET)
	public ModelAndView greetings() {
		Map<String, String> model = new HashMap<String, String>();
		model.put("greetMsg", "Hello Everyone Accept greetings from company class");

		ModelAndView modelAndView = new ModelAndView("greeting", model);
		return modelAndView;
	}

	// URL - http://localhost:8080/
	@RequestMapping(value = "/categoryadvertise", method = RequestMethod.GET)
	public ModelAndView getCompanies() {
		List<Category> category = categoryService.getAllCategory();
		Map<String, List<Category>> model = new HashMap<String, List<Category>>();

		model.put("allCategory", category);

		ModelAndView modelAndView = new ModelAndView("categoryinfo", model);
		return modelAndView;
	}

	

	@RequestMapping(value = "/addcategory", method = RequestMethod.POST)
	public ModelAndView addCategory(@RequestBody Category category) {

		String message = categoryService.addCategory(category);
		Map<String, String> model = new HashMap<String, String>();
		model.put("message", message);
		ModelAndView modelAndView = new ModelAndView("success", model);
		return modelAndView;
	}

	
	@GetMapping("/categoryform")
	public ModelAndView getCategoryForm(@ModelAttribute Category category) {
		ModelAndView modelAndView = new ModelAndView("categoryform");
		return modelAndView;
	}

	// On submitting the form -- on click submit button below method is called
	@RequestMapping(value = "/savecategory", method = RequestMethod.POST)
	public ModelAndView savecategory(@ModelAttribute Category category) {

		String message = categoryService.addCategory(category);
		Map<String, String> model = new HashMap<String, String>();
		model.put("message", message);
		ModelAndView modelAndView = new ModelAndView("success", model);
		return modelAndView;
	}
}