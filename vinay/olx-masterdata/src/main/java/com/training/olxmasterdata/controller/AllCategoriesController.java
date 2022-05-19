package com.training.olxmasterdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.training.olxmasterdata.entites.Categories;
import com.training.olxmasterdata.service.CategoriesService;

public class AllCategoriesController {
	
	@Autowired
	CategoriesService service;
	//http://localhost:9001/api/v4/categorie/allcategories
	@RequestMapping(value="api/v4/categorie/allcategories",
			method = RequestMethod.GET,
			produces = {MediaType.APPLICATION_XML_VALUE})
	public List<Categories> getCategories()
	{
		return service.getAllCategories();
	}

}
