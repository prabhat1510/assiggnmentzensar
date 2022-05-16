package com.assignment.demo.Repository;

import org.apache.tomcat.jni.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



	@Repository
	public interface CollegeRepository extends CrudRepository<Address, Integer>
	{
		
	}

