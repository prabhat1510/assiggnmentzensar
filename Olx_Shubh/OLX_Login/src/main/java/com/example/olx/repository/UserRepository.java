package com.example.olx.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.olx.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
