package com.cg.restservice.FirstSpringBootApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cg.restservice.FirstSpringBootApp.pojo.Employee;

@Repository
public interface EmployeeRepository extends /*JpaRepository*/MongoRepository<Employee, Integer>{
}
