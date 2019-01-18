package com.cg.mongo.SpringDataMongoDb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.mongo.SpringDataMongoDb.entity.Employee;
import com.cg.mongo.SpringDataMongoDb.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository repository;
	
	@Override
	public void addNewEmployee(Employee employee) {
		repository.save(employee);
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		return repository.findAll();
	}

	@Override
	public void updateEmployee(Employee employee) {
		repository.save(employee);
	}

	@Override
	public void deleteEmployee(int empId) {
		repository.deleteById(empId);
		
	}

	@Override
	public Employee getEmployeeById(int empId) {
		Employee employee= repository.findById(empId).get();
		 return repository.save(employee) ;
		
	}
}
