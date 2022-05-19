package com.training.olxmasterdata.service;



import java.util.List;

import com.training.olxmasterdata.entites.Categories;
import com.training.olxmasterdata.exceptions.CategorieNotUpdate;
import com.training.olxmasterdata.exceptions.NoCategoriesFoundException;


public interface CategoriesService {
	
	public Categories addCategories(Categories categorie);
	
	public Categories retriveCategories(Integer id) throws NoCategoriesFoundException;
	
	public String deleteCategories(Integer id);
	
	public String updateCategories(Categories categorie) throws CategorieNotUpdate;
	
	public List<Categories> getAllCategories();

}