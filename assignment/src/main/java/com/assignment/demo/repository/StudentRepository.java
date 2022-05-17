package com.assignment.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignment.demo.entities.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
