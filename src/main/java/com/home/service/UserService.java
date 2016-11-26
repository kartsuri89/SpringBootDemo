package com.home.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.home.model.Employee;

public interface UserService {

	public List<Employee> listAll();
}
