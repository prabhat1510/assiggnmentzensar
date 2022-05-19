package com.training.olxusers.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.olxusers.entity.Users;


@Repository
public interface UserRepository extends CrudRepository<Users, Integer>{

}
