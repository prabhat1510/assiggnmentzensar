package com.assignment.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.assignment.demo.entities.Categories;
import com.assignment.demo.service.CategoriesService;

public class AllCategoriesController {
	@Autowired
	CategoriesService categoriesService;
		
	//Receiving data from client
	@RequestMapping(value="/api/v2/advstatus/allcategories", 
				method=RequestMethod.GET,
				//consumes= {MediaType.APPLICATION_XML_VALUE},
				produces={MediaType.APPLICATION_XML_VALUE})
		public List<Categories> getCategories(){
			return categoriesService.getAllCategories();
		}

}
