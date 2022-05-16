package com.training.shubhamcollege.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.shubhamcollege.entities.College;

@Repository
public interface CollegeRepository extends CrudRepository<College, Integer> {
	@Query(value = "SELECT * from college where collegeId=?", nativeQuery = true)
	College findCollegeById(Integer collegeId);
}