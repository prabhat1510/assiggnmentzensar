package com.olx.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.olx.demo.entities.CATEGORIES;
import com.olx.demo.service.CategoriesService;

@RestController
@RequestMapping(value="/advertise")
public class CategoriesController {

	@Autowired
	CategoriesService categoriesService;
	
	//Create
	@PostMapping("/addcategory")
	public CATEGORIES addCategories(@RequestBody CATEGORIES categories) {
		return categoriesService.addCategories(categories);
	}
	
	// Returns all advertisement categories
	@RequestMapping(value="/category",
			method = RequestMethod.GET,
			//consumes = {MediaType.APPLICATION_XML_VALUE},
			produces = {MediaType.APPLICATION_XML_VALUE})
	public List<CATEGORIES> getCategories() {
		return categoriesService.getAllCategories();
	}
}