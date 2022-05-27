package com.assignment.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.demo.entities.Categories;
import com.assignment.demo.exceptions.CategorieNotUpdate;
import com.assignment.demo.exceptions.NoCategoriesFoundException;

import com.assignment.demo.repository.CategoriesRepository;

@Service
public class CategoriesServiceImpl implements CategoriesService {
	@Autowired
	CategoriesRepository categoriesRepository;

	@Override
	public Categories addCategories(Categories categories) {
		return categoriesRepository.save(categories);
	}

	@Override
	public Categories retrieveCategories(Integer id) throws NoCategoriesFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCategories(Integer id) {
		categoriesRepository.deleteById(id);
		return "Categories with Id ---" + id + "  deleted successfully";
	}

	@Override
	public String updateCategories(Categories categories) throws CategorieNotUpdate {
		Optional<Categories> cat = categoriesRepository.findById(categories.getId());
		if (cat.isPresent()) {
			Categories ca = categoriesRepository.save(categories);
			if (ca != null) {
				return "Categories updated successfully";
			} else {
				return "ERROR while updating";
			}
		} else {
			throw new CategorieNotUpdate();
		}
	}

	@Override
	public List<Categories> getAllCategories() {
		return (List<Categories>) categoriesRepository.findAll();

	}

}
