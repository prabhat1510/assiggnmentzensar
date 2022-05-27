package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entites.Users;

public interface Userrepository extends CrudRepository<Users,Integer>{

}
