package com.assignment.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignment.demo.entities.Categories;
@Repository
public interface CategoriesRepository extends CrudRepository<Categories, Integer> {

}
