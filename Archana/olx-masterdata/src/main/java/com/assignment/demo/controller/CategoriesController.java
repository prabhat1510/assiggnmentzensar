package com.assignment.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.demo.entities.Categories;
import com.assignment.demo.service.CategoriesService;

@RestController
@RequestMapping(value = "/advertise")
public class CategoriesController {
	@Autowired
	CategoriesService catgoriesService;

	@GetMapping("/categories")
	public List<Categories> allCategories() {
		List<Categories> categories = catgoriesService.allCategories();
		return categories;
	}
}
