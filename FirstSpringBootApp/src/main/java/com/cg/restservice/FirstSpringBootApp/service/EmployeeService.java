package com.cg.restservice.FirstSpringBootApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.restservice.FirstSpringBootApp.pojo.Employee;

public interface EmployeeService {
	
	void addNewEmployee( Employee employee) ;
	List<Employee> getAllEmployees();
	void updateEmployee(Employee employee);
	void deleteEmployee(int empId);
	Employee getEmployeeById(int empId);
}
