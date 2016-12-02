package com.home.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.dao.EmployeeRepository;
import com.home.model.Employee;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> listAll = null;
	
	@Override
	public List<Employee> listAll() {
		listAll = employeeRepository.findAll();
		
		return listAll;
	}

}
