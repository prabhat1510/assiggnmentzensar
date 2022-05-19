package com.assignment.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.demo.entities.Categories;
import com.assignment.demo.repository.CategoriesRepository;

@Service
public class CategoriesServiceImpl implements CategoriesService {
	@Autowired
	CategoriesRepository categoriesrepository;

	@Override
	public List<Categories> allCategories() {
		return (List<Categories>) categoriesrepository.findAll();
	}

}
