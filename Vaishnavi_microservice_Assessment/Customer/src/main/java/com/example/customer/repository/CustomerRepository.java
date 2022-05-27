package com.example.customer.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



import com.example.customer.entities.Customer;



@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {



}
