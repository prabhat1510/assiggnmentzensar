package com.olx.masterdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olx.masterdata.entities.Categories;
import com.olx.masterdata.repository.CategoriesRepository;

@Service
public class CategoriesServiceImpl implements CategoriesService {
	
	@Autowired
	CategoriesRepository repository;

	@Override
	public List<Categories> allCategories() {
		return (List<Categories>) repository.findAll();
	}

}
