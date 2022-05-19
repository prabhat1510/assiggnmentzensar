package com.training.olx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.olx.entities.Categories;
import com.training.olx.repository.CategoriesRepository;


public class CategoriesServiceImpl implements CategoriesService {
	@Autowired
	CategoriesRepository repository;

	@Override
	public List<Categories> allCategories() {
		return (List<Categories>) repository.findAll();
	}

}
