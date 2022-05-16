package com.assignment.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignment.demo.entities.College;
@Repository
public interface CollegeRepository extends CrudRepository<College, Integer> {

}
