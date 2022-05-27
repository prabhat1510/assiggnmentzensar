package com.assignment.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignment.demo.entites.Customer;
@Repository
public interface CustomerRepository extends CrudRepository<Customer,Integer> {

}
