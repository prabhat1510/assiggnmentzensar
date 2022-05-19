package com.olx.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olx.demo.entities.CATEGORIES;
import com.olx.demo.repository.CategoriesRepository;

@Service
public class CategoriesServiceImpl implements CategoriesService {

	@Autowired
	CategoriesRepository categoriesRepository;

	@Override
	public CATEGORIES addCategories(CATEGORIES categories) {

		return categoriesRepository.save(categories);
	}

	@Override
	public List<CATEGORIES> getAllCategories() {
		return (List<CATEGORIES>) categoriesRepository.findAll();
	}

}