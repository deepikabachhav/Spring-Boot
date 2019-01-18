package com.cg.mongo.SpringDataMongoDb.service;

import java.util.List;

import com.cg.mongo.SpringDataMongoDb.entity.Employee;

public interface EmployeeService {
	void addNewEmployee( Employee employee) ;
	List<Employee> getAllEmployees();
	void updateEmployee(Employee employee);
	void deleteEmployee(int empId);
	Employee getEmployeeById(int empId);
}
