
package com.training.olxmasterdata.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.olxmasterdata.entities.Category;
import com.training.olxmasterdata.repository.CategoryRepository;


@Service
public   class CategoryServiceImpl  implements CategoryService {
	//@Autowired
	//CompanyDAO companyDAO;
	@Autowired
	CategoryRepository repository;
	@Override
	public List<Category> getAllCategory() {
		return (List<Category>) repository.findAll();
	}

	@Override
	public Category getCategoryById(Long id) {
		Optional<Category> category1 = repository.findById(id);
		if( category1.isPresent()) {
		return  category1.get();
		}else {
			return null;
		}
			
	}

	@Override
	public String addCategory(Category category) {
		Category cat = repository.save(category);
		if(cat != null) {
			return "Company with id --"+cat.getCategoryById()+" added successfully";
		}else {
			return "Unable to add company";
		}
	}

}
