package com.assignment.demo.service;

import java.util.List;

import com.assignment.demo.entities.Categories;
import com.assignment.demo.exceptions.CategorieNotUpdate;
import com.assignment.demo.exceptions.NoCategoriesFoundException;

public interface CategoriesService {
	// Create
	public Categories addCategories(Categories categories);

	// Retrieve
	public Categories retrieveCategories(Integer id) throws NoCategoriesFoundException;

	// Delete
	public String deleteCategories(Integer id);

	// Update
	public String updateCategories(Categories categories) throws CategorieNotUpdate;

	// Retrieve all books
	public List<Categories> getAllCategories();

}
