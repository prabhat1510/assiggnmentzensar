package com.training.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.example.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}