package com.assignment.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.assignment.demo.entities.Categories;

public interface CategoriesRepository extends CrudRepository<Categories, Integer> {

}
