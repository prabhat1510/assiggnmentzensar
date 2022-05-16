package com.training.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.demo.entities.College;

@Repository
public interface CollegeRepository extends CrudRepository<College, Integer> {

}