package com.training.olxmasterdata.service;

import java.util.List;


import com.training.olxmasterdata.entities.Category;

public interface CategoryService {
	public List<Category> getAllCategory();
	public Category getCategoryById(Long id);
	public String addCategory(Category category);
	
	
}
