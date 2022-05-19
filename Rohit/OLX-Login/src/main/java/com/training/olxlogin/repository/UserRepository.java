package com.training.olxlogin.repository;

import org.springframework.data.repository.CrudRepository;

import com.training.olxlogin.entities.Users;

public interface UserRepository extends CrudRepository<Users, Integer> {

}
