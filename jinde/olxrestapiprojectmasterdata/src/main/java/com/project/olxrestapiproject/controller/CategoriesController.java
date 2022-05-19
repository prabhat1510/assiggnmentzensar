package com.project.olxrestapiproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.olxrestapiprojectmaster.service.CategoriesService;

import olxrestapiprojectmasterdata.entities.Categories;

@RestController
@RequestMapping(value = "/advertise")
public class CategoriesController {
	@Autowired
	CategoriesService catService;
	
	
	@GetMapping("/categories")
	public List<Categories> allCategories() {
		List<Categories> categories = catService.allCategories();
		return categories;
	}

}

