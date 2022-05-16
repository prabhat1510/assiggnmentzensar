package com.training.user.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.user.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {

}
