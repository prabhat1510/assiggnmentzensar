package com.olx.masterdata.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ch.qos.logback.core.status.Status;



@Repository
public interface statusRepository extends CrudRepository<Status, Integer> {

}