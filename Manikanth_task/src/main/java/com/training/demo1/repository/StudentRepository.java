package com.training.demo1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.college.demo.entities.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}