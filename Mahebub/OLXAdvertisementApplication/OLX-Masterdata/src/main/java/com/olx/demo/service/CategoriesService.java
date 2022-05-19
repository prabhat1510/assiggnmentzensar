package com.olx.demo.service;

import java.util.List;

import com.olx.demo.entities.CATEGORIES;

public interface CategoriesService {
	// Create
	public CATEGORIES addCategories(CATEGORIES categories);

	// get all CATEGORIES
	public List<CATEGORIES> getAllCategories();
}
