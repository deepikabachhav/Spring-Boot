package com.cg.mongo.SpringDataMongoDb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cg.mongo.SpringDataMongoDb.entity.Employee;
@Repository
public interface EmployeeRepository extends MongoRepository<Employee,Integer> {

}
