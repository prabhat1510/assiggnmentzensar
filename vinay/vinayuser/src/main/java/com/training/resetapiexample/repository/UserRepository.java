package com.training.resetapiexample.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.resetapiexample.entity.User;



@Repository
public interface UserRepository extends CrudRepository<User,Integer> {

}