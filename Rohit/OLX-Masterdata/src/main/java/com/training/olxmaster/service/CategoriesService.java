package com.training.olxmaster.service;

import java.util.List;

import com.training.olxmaster.entities.Categories;
import com.training.olxmaster.exception.CategorieNotUpdate;
import com.training.olxmaster.exception.NoCategoriesFoundException;

public interface CategoriesService {
	
	public Categories addCategories(Categories categorie);
	
	public Categories retriveCategories(Integer id) throws NoCategoriesFoundException;
	
	public String deleteCategories(Integer id);
	
	public String updateCategories(Categories categorie) throws CategorieNotUpdate;
	
	public List<Categories> getAllCategories();

}
