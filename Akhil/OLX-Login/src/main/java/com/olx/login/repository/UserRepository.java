package com.olx.login.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.olx.login.entities.Users;

@Repository
public interface UserRepository extends CrudRepository<Users, Integer> {

}
