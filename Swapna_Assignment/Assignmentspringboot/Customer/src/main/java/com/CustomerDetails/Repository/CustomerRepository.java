package com.CustomerDetails.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.CustomerDetails.entities.CustomerDetails;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerDetails, Integer> {

}
