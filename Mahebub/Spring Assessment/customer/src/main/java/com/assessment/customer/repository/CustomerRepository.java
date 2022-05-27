package com.assessment.customer.repository;

import org.springframework.data.repository.CrudRepository;

import com.assessment.customer.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Integer> {

}
