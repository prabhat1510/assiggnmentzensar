package com.customer.entity.repository;

import org.springframework.data.repository.CrudRepository;

import com.customer.entity.Customer;



public interface CustomerRepository extends CrudRepository<Customer,Integer>{
	
}
