package com.training.olxmasterdata.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.olxmasterdata.entites.Categories;
import com.training.olxmasterdata.exceptions.CategorieNotUpdate;
import com.training.olxmasterdata.exceptions.NoCategoriesFoundException;
import com.training.olxmasterdata.repository.CategoriesRepository;



@Service
public class CategoriesServiceImpl implements CategoriesService{

	@Autowired
	CategoriesRepository categoriesRepository;

	@Override
	public Categories addCategories(Categories categorie) {
		return categoriesRepository.save(categorie);
	}

	@Override
	public Categories retriveCategories(Integer id) throws NoCategoriesFoundException {
		Optional<Categories> cato=categoriesRepository.findById(id);
		if(cato.isPresent())
		{
			return cato.get();
		}
		else {
			throw new NoCategoriesFoundException();
		}
	}

	@Override
	public String deleteCategories(Integer id) {
		categoriesRepository.deleteById(id);
		return "Categorie with"+id+"delete successfully";
	}

	@Override
	public String updateCategories(Categories categorie) throws CategorieNotUpdate {
		Optional<Categories> cat=categoriesRepository.findById(categorie.getId());
		if(cat.isPresent())
		{
			Categories c= categoriesRepository.save(categorie);
			if(c!=null)
			{
				return "Categorie updated Successfully";
			}
			else {
				return "ERROR! while updating Catrgorie";
			}
		}
		else {
			throw new CategorieNotUpdate();
		}
	}

	@Override
	public List<Categories> getAllCategories() {
		// TODO Auto-generated method stub
		return null;
	}

}

