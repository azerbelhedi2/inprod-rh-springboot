package com.inprod.rh.services;

import java.util.List;

import com.inprod.rh.models.Employee;

public interface IEmployeeService {
	
	 public List<Employee> findAllEmployee() ; 
	 public Employee addEmployee(Employee employee); 
	 public Employee removeEmployee(Employee employee); 
	 public Employee updatEmployee(Employee employee); 
}
