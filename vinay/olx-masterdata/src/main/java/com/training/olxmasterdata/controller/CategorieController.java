package com.training.olxmasterdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.olxmasterdata.entites.Categories;
import com.training.olxmasterdata.exceptions.CategorieNotUpdate;
import com.training.olxmasterdata.exceptions.NoCategoriesFoundException;
import com.training.olxmasterdata.service.CategoriesService;

@RestController
@RequestMapping(value = "/api/v1/categorie")
public class CategorieController {
	

		@Autowired
		CategoriesService categoriesService;
		
		//url:http://localhost:9090/api/v2/categorie/addcategorie
		@PostMapping("/addcategorie")
		public Categories addCategories(@RequestBody Categories categorie)
		{
			return categoriesService.addCategories(categorie);
			
		}
		
		
		//url:http://localhost:9090/api/v2/categorie/5
		@GetMapping("/{id}")
		public Categories retriveCategories(Integer id) throws NoCategoriesFoundException
		{
			return categoriesService.retriveCategories(id);
			
		}
		
		//url:http://localhost:9090/api/v2/categorie/deletecategories/3
		@DeleteMapping("/deletecategories/{id}")
		public String deleteCategories(Integer id) {
			return categoriesService. deleteCategories(id);
		}

		//url:http://localhost:9090/api/v2/categorie/updatcategories
		@PutMapping("/updatcategories")
		public String updateCategories(Categories categorie) throws CategorieNotUpdate
		{
			return categoriesService.updateCategories(categorie);
		}

	}