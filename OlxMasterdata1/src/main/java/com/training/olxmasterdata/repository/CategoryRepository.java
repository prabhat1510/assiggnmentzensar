package com.training.olxmasterdata.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.olxmasterdata.entities.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

}
