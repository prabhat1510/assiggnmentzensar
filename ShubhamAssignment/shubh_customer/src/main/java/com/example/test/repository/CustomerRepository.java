package com.example.test.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.test.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{

}
