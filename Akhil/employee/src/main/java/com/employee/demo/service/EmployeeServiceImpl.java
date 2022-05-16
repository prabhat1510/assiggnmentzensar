package com.employee.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.demo.entities.Employee;
import com.employee.demo.exceptions.NoEmployeeFoundException;
import com.employee.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository repository;
	
	@Override
	public Employee addEmployee(Employee employee) {
		return repository.save(employee);
	}

	@Override
	public Employee retrieveEmpoyee(Integer empId) throws NoEmployeeFoundException {
		Optional<Employee> emp = repository.findById(empId);
		
		if(emp.isPresent()) {
			return emp.get();
		} else {
			throw new NoEmployeeFoundException();
		}
	}

	@Override
	public String updateEmployee(Employee employee) throws NoEmployeeFoundException {
		Optional<Employee> emp = repository.findById(employee.getEmpId());
		if (emp.isPresent()) {
			Employee e = repository.save(employee);
			if (e != null) {
				return "Employee entity updated successfully";
			} else {
				return "Employee entity not updated successfully";
			}
		} else {
			throw new NoEmployeeFoundException();
		}

	}

	@Override
	public String deleteEmployee(Integer empId) throws NoEmployeeFoundException {
		Optional<Employee> emp = repository.findById(empId);
		
		if(emp.isPresent()) {
			repository.deleteById(empId);
			return "Book with bookId ---" + empId + "  deleted successfully";
		} else {
			throw new NoEmployeeFoundException();
		}
	}

	@Override
	public List<Employee> allStudents() {
		
		return (List<Employee>) repository.findAll();
	}
	

}
