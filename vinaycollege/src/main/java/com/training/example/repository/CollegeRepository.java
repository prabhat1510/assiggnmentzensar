package com.training.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.example.entity.College;

@Repository
public interface CollegeRepository extends CrudRepository<College, Integer> {

}