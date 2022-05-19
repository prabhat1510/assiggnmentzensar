package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.College;

public interface Collegerepository extends CrudRepository<College, Integer> {

}