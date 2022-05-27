package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.Advertises;
@Repository
public interface Advertiserepository extends CrudRepository<Advertises,Integer>{

}
