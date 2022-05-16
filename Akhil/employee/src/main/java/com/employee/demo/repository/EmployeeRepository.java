package com.employee.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employee.demo.entities.Employee;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

}