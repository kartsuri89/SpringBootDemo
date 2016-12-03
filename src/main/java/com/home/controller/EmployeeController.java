package com.home.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.model.Employee;
import com.home.service.UserService;


@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class EmployeeController {

	@Autowired
	private UserService userService;

	@GetMapping(path="/",produces={MediaType.APPLICATION_JSON_VALUE})
	public List<Employee> getAllEmployee(){
		List<Employee> getAllEmployee = userService.listAll();
		return getAllEmployee;
	}
}
