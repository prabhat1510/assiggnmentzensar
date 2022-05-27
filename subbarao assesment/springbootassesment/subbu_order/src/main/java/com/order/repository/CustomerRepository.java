package com.order.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.order.entity.Customer;


@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>
 {
	

}
