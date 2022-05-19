package com.olx.advertise.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.olx.advertise.entities.Advertises;

@Repository
public interface advertiseRepository extends CrudRepository<Advertises,Integer> {

}


