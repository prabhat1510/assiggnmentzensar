package com.spring.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.customer.model.Customer;

public interface  CustomerRepository  extends JpaRepository<Customer, Integer>{

}
