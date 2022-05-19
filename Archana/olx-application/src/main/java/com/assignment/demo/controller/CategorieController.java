package com.assignment.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.demo.entities.Categories;
import com.assignment.demo.exceptions.NoCategoriesFoundException;
import com.assignment.demo.service.CategoriesService;


@RestController
@RequestMapping(value="/api/v1/categories")

public class CategorieController {
	@Autowired
	CategoriesService categoriesService;
	//Create
		@PostMapping("/addcategories")
		public Categories addCategories(@RequestBody Categories categories) {
			return categoriesService.addCategories(categories);
		}
		//Retrieve
		@GetMapping("/{id}")
		public Categories retrieveCategories(@PathVariable Integer id) throws NoCategoriesFoundException {
			
			return categoriesService.retrieveCategories(id);
		}
		
		//Delete
				@DeleteMapping("/removecategories/{id}")
				public String deleteCategories(@PathVariable Integer id) {
					
					return categoriesService.deleteCategories(id);
				}
				
				
	
}
