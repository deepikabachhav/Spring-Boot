package com.cg.restservice.FirstSpringBootApp.resource;

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

import com.cg.restservice.FirstSpringBootApp.pojo.Employee;
import com.cg.restservice.FirstSpringBootApp.service.EmployeeService;

@RestController
@RequestMapping("/employees") //Addressable Resource
public class EmployeeResource {
	@Autowired
	private EmployeeService service;
	
	@PostMapping //Uniform Constraint Interface
	public void addNewEmployee(@RequestBody Employee employee) {
		service.addNewEmployee(employee);
	}
	
	@GetMapping
	//@RequestMapping(method=RequestMethod.GET, produces= {"application/json","application/xml"}) //Uniform Constraint Interface
	public List<Employee> getAllEmployees(){
		return service.getAllEmployees();
	}
	@PutMapping
	public void updateEmployee(@RequestBody Employee employee) {
		service.updateEmployee(employee);
	}
	
	@DeleteMapping("/{empId}")
	public void deleteEmployee(@PathVariable int empId) {
		service.deleteEmployee(empId);
	}
	
	@GetMapping("/{empId}")
	public Employee getEmployeeById(@PathVariable int empId) {
		return service.getEmployeeById(empId);
		
	}
}
