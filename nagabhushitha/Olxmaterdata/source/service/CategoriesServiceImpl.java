package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Categories;
import com.example.demo.repository.CategoriesRepository;

@Service
public class CategoriesServiceImpl implements CategoriesService {
	
	@Autowired
	CategoriesRepository repository;

	@Override
	public List<Categories> allCategories() {
		return (List<Categories>) repository.findAll();
	}

