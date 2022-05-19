package com.olx.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.olx.demo.entities.Users;

public interface RoleRepository extends CrudRepository<Users,Integer> {
	
}