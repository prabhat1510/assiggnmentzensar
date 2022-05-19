package com.training.olxmasterdata.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.olxmasterdata.entites.AdvStatus;
@Repository
public interface AdvStatusRepository extends CrudRepository<AdvStatus, Integer> {

}
