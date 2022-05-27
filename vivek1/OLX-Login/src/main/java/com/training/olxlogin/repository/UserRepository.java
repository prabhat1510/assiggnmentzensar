package com.training.olxlogin.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.olxlogin.entities.Users;

@Repository
public interface UserRepository extends CrudRepository<Users, Integer> {

}