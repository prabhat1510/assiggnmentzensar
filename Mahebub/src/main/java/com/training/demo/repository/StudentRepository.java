package com.training.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.demo.entities.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

	@Query(value = "SELECT * from student where studentId=?", nativeQuery = true)
	Student findStudentById(Integer studentId);
	
	@Query(value = "SELECT * from student where college_id=?", nativeQuery = true)
	List<Student> findAllStudentByCollegeId(Integer collegeId);
}