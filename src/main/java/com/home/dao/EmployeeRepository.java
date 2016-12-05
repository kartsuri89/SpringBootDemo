package com.home.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.home.model.Employee;

@EnableMongoRepositories
public interface EmployeeRepository extends MongoRepository<Employee, String> {
	
	//public List<Employee> find();

}
