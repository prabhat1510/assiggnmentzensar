package com.training.olxmaster.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.olxmaster.entities.AdvStatus;


@Repository
public interface AdvStatusRepository extends CrudRepository<AdvStatus, Integer> {

}
