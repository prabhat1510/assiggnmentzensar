package com.training.olx.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.olx.entities.AdvStatus;


@Repository
public interface AdvStatusRepository extends CrudRepository<AdvStatus,Integer> {

}
