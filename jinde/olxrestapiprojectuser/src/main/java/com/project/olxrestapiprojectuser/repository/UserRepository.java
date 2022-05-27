package com.project.olxrestapiprojectuser.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import olxuserrestapiprojectuser.entities.Users;

@Repository
public interface UserRepository extends CrudRepository<Users, Integer> {

}