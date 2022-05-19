package com.assignment.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignment.demo.entities.AdvStatus;

@Repository
public interface AdvStatusRepository extends CrudRepository<AdvStatus, Integer> {

}
