package com.training.olxmasterdata.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.olxmasterdata.entities.Categories;

@Repository
public interface CategoriesRepository extends CrudRepository<Categories, Integer> {

}
