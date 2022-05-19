package com.training.demo1.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.college.demo.entities.College;

@Repository
public interface CollegeRepository extends CrudRepository<College, Integer> {

}
