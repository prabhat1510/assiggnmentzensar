package com.employee.demo.service;

import java.util.List;

import com.employee.demo.entities.Employee;
import com.employee.demo.exceptions.NoEmployeeFoundException;

public interface EmployeeService {
	
	public List<Employee> allStudents();
	public Employee addEmployee(Employee employee);
	public Employee retrieveEmpoyee(Integer id) throws NoEmployeeFoundException;
	public String updateEmployee(Employee employee) throws NoEmployeeFoundException;
	public String deleteEmployee(Integer id) throws NoEmployeeFoundException;

}
