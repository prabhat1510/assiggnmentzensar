package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Student;

public interface Studentrepository extends CrudRepository<Student, Integer> {

}