package com.home.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.home.model.Employee;
import com.home.service.UserService;

@RestController
public class EmployeeController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(path="/",method=RequestMethod.GET,produces={MediaType.APPLICATION_JSON_VALUE})
	public List<Employee> getAllEmployee(){
		List<Employee> getAllEmployee = userService.listAll();
		return getAllEmployee;
	}
}
