package com.training.olx.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.olx.entities.Categories;

@Repository
public interface CategoriesRepository extends CrudRepository<Categories, Integer> {

}
