package com.olx.masterdata.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.olx.masterdata.entities.AdvStatus;

@Repository
public interface AdvStatusRepository extends CrudRepository<AdvStatus, Integer> {

}
