package com.home.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.home.model.Employee;

@Service("userService")
public class UserServiceImpl implements UserService {

	public List<Employee> listAll = null;
	
	@Override
	public List<Employee> listAll() {
		listAll = new ArrayList<Employee>();
		listAll.add(new Employee("Suriya","Software Engineer"));
		listAll.add(new Employee("Sanjay","Lead Engineer"));
		return listAll;
	}

}
