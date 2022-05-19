package com.olx.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.olx.demo.entities.ADV_STATUS;

public interface StatusRepository extends CrudRepository<ADV_STATUS,Integer> {

}
