package com.olx.masterdata.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.olx.masterdata.entities.Categories;

@Repository
public interface CategoriesRepository extends CrudRepository<Categories, Integer> {

}