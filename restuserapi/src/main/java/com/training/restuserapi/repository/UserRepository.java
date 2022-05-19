package com.training.restuserapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.restuserapi.entities.User;


@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

}
