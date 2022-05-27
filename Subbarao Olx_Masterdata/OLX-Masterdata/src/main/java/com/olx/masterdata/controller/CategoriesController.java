package com.olx.masterdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olx.masterdata.entities.Categories;
import com.olx.masterdata.service.CategoriesService;

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