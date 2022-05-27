package com.project.olxrestapiprojectmaster.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.olxrestapiprojectmaster.repository.CategoriesRepository;

import olxrestapiprojectmasterdata.entities.Categories;

@Service
public class CategoriesServiceImpl implements CategoriesService {
	
	@Autowired
	CategoriesRepository repository;

	@Override
	public List<Categories> allCategories() {
		return (List<Categories>) repository.findAll();
	}

}