package com.employee.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.demo.entities.Employee;
import com.employee.demo.exceptions.NoEmployeeFoundException;
import com.employee.demo.service.EmployeeService;


@RestController
@RequestMapping(value="/api/v1/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	// Adding Employee
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return empService.addEmployee(employee);
	}
	
	// Getting All Employees
	@GetMapping("/allemployees")
	public List<Employee> allStudents() {
		List<Employee> emp = empService.allStudents();
		
		return emp;
	}
	
	// Getting Employee By Id
	@GetMapping("/{empId}")
	public Employee retrieveEmployee(@PathVariable Integer empId) throws NoEmployeeFoundException {
		return empService.retrieveEmpoyee(empId);
	}
	
	// Deleting Employee By Id
	@DeleteMapping("/removeemployee/{empId}")
	public String deleteEmployee(@PathVariable Integer empId) throws NoEmployeeFoundException {
		return empService.deleteEmployee(empId);
	}
	
	// Updating Employee
	@PutMapping("/updateemployee")
	public String updateEmployee(@RequestBody Employee employee) throws NoEmployeeFoundException {
		return empService.updateEmployee(employee);
	}

}
