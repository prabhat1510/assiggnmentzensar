package com.training.olxmaster.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.olxmaster.entities.Categories;
import com.training.olxmaster.service.CategoriesService;

@RestController
@RequestMapping(value = "/api/v4/categorie")
public class AllCategoriesController {
	
	@Autowired
	CategoriesService service;
	//http://localhost:9090/api/v4/categorie/allcategories
	@RequestMapping(value="api/v4/categorie/allcategories",
			method = RequestMethod.GET,
			produces = {MediaType.APPLICATION_XML_VALUE})
	public List<Categories> getCategories()
	{
		return service.getAllCategories();
	}

}
