package com.assignment.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignment.demo.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}