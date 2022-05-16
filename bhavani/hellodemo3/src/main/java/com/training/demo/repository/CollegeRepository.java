package com.training.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.training.demo.entities.College;



public interface CollegeRepository extends CrudRepository<College, Integer> {
}
	
